package arrays.arrayssourcecode;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        a.add("6");
        a.add("7");
        a.add("8");
        a.add("9");
        int i = 1;
        System.out.println(a.get(i++));
        System.out.println(a.get(1));
        ArrayList<String> b = new ArrayList<String>();
        b.add("1");
        b.add("2");
        b.add("3");
        b.add("10");
        a.removeAll(b);
        System.out.println("++++++++++++++++++");
        for (int i1 = 0; i1 < a.size(); i1++) {
            System.out.println(a.get(i1));
        }
    }
}
