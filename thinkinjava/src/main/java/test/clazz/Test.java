package test.clazz;

public class Test {

    interface TestInterface{
        void test();
    }

    static class TestClass implements  TestInterface{

        public void test(){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        TestInterface ti = new Test.TestClass();
        ti.test();
    }
}