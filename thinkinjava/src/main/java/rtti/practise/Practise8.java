package rtti.practise;

public class Practise8 {

    public static void printSuperClasses(Object o) throws IllegalAccessException, InstantiationException {
        Class c = o.getClass();
        System.out.println(c.getName());
        f(c.getSuperclass());

    }

    static void f(Class c){
        System.out.println(c.getName());
        System.out.println("getDeclaredFields = " + c.getDeclaredFields());
        try{
            f(c.getSuperclass());
        }catch(Exception e){
        }
    }

    public static void main(String[] args) {
        try {
            printSuperClasses(new D());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}

class A{}
class B extends A{}
class C extends B{}
class D extends C{}