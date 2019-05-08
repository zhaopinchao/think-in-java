package arrays.arrayssourcecode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetTest {
    public static void main(String[] args) {

        List<String> s = new ArrayList<String>();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");
        s.add("6");
        HashSet<String> h = new HashSet<String>(s);
    }
}
