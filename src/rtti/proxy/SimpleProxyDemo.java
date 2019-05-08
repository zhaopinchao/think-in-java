package rtti.proxy;

interface Interface{
    void doSomething();
    void somethingElse(String str);
}

class RealObject implements Interface{

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String str) {
        System.out.println("somethingElse " + str);
    }
}


class SimpleProxy implements Interface{

    private Interface proxied;
    private static int count = 0;
    private static int scount = 0;

    public SimpleProxy(Interface inter){
        this.proxied = inter;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
        System.out.println(++count);
    }

    @Override
    public void somethingElse(String str) {
        System.out.println("SimpleProxy somethingElse " + str);
        proxied.somethingElse(str);
        System.out.println(++scount);
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface proxied){
        proxied.doSomething();
        proxied.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
