package test.clazz;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class TestClass extends AbstractMap<String, String> {




    public static void main(String[] args) {
        Map<String, String> map = new TestClass();
        System.out.println(map);
    }

    @Override
    public Set<Entry<String, String>> entrySet() {
        System.out.println("entrySet()");
        return null;
    }
}
