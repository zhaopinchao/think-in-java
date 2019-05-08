package arrays.arrayssourcecode;


import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        String[] strings = new String[10];
        strings[0] = "a";
        strings[1] = "a";
        strings[2] = "a";
        strings[3] = "a";
        strings[4] = "a";
        strings[5] = "a";
        strings[6] = "a";
        strings[7] = "a";
        strings[8] = "a";
        strings[9] = "a";
        String[] s2 = Arrays.copyOf(strings,15);
        for (int i =0; i < s2.length; i++){
            System.out.println("s2["+i+"] = " + s2[i] );
        }
        ArrayList arrayList = new ArrayList<String>(Arrays.asList(s2));
        Iterator iterator = arrayList.listIterator();
        iterator.next();
        System.out.println(((ListIterator) iterator).previous());
        System.out.println(((ListIterator) iterator).previousIndex());
        System.out.println(((ListIterator) iterator).hasPrevious());
        System.out.println(arrayList.size());
        arrayList.add(3,"cccc");
        System.out.println(arrayList.size());
        LinkedList<String> l = new LinkedList<String>();
        l.size();
    }
}
