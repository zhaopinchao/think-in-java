package rtti.practise;

public class Practise10 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = char[].class;
        String superName = c.getSuperclass().getName();
        if (superName != null){
            System.out.println("char[] 不是基本类型");
        }else{
            System.out.println("char[] 是基本类型");
        }
        Class.forName("rtti.Trapezoid").getSuperclass().newInstance();


        System.out.println(new String().getClass().getSuperclass());
        System.out.println(int.class.getSuperclass());
        Class cccc = Practise10.class;
    }


}