package rtti;

public class GenericClassReferences {

    public static void main(String[] args) {
        Class<?> intClass = int.class;
        Class<Integer> genericIntClass = Integer.TYPE;
        genericIntClass = Integer.class;
        intClass = double.class;
//        genericIntClass = double.class;
    }
}
