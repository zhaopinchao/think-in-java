package arrays.practise;

import arrays.Countries;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practise3 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();
        int size = Countries.DATA.length;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < size; i++){
                hashSet.add(Countries.DATA[i][0]);
                linkedHashSet.add(Countries.DATA[i][0]);
                treeSet.add(Countries.DATA[i][0]);
            }
        }
        System.out.println("++++++hashSet = " + hashSet);
        System.out.println("linkedHashSet = " + linkedHashSet);
        System.out.println("++++++treeSet = " + treeSet);
    }
}
