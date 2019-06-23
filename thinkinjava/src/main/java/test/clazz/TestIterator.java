package test.clazz;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class TestIterator extends AbstractSet<Map.Entry<String, String>> implements Iterator<Map.Entry<String, String>> {
    int a = 10;
    int b = 0;

    @Override
    public boolean hasNext() {
        b++;
        System.out.println("b = " + b);
        return b < a;
    }

    @Override
    public Map.Entry<String, String> next() {
        System.out.println("next()");
        return null;
    }



    public static void main(String[] args) {
        System.out.println(new TestIterator());

    }

    @Override
    public Iterator<Map.Entry<String, String>> iterator() {
        System.out.println("iterator()");
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
