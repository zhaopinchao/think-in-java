package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {

    public static void trackUseCase(List<Integer> useCase, Class<?> cl) {

        for (Method m : cl.getDeclaredMethods()) {
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Found Use Case: " + uc.id() + " " + uc.description());
                useCase.remove(new Integer(uc.id()));
            }
        }
        for (int i : useCase) {
            System.out.println("Warning: Missing use case=" + i);
        }
    } 

    public static void main(String[] args) {
        List<Integer> useCase = new ArrayList<Integer>();
        Collections.addAll(useCase, 47, 48, 49, 50);
        trackUseCase(useCase, PasswordUtils.class);
    }
}
