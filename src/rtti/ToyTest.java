package rtti;


interface HashBatteries {
}

interface Waterproof {
}

interface Shoots {
}

interface  NewInterface{

}
class Toy {
//    Toy() {
//    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HashBatteries, Waterproof, Shoots, NewInterface{
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class Name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());

    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("rtti.FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        Class up = c.getSuperclass();

        Object obj = null;

        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.exit(1);
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
