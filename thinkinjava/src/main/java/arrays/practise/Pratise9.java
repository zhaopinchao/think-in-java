package arrays.practise;

import java.util.Random;
import java.util.TreeSet;

public class Pratise9 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
//        for (int i = 0; i < 10; i++) {
////            String str = Integer.toHexString((int)(Math.random()*1000));
////            System.out.println("str = " + str);
////            treeSet.add(str);
////        }
        treeSet.add("bbc");
        treeSet.add("bad");
        treeSet.add("bcb");
        treeSet.add("aaa");
        System.out.println(treeSet);
    }
}
