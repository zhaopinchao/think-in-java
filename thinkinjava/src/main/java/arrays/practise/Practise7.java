package arrays.practise;

import arrays.Countries;

import java.util.*;

public class Practise7 {

    public static void main(String[] args) {

        ArrayList<String> arrays = new ArrayList<String>(Countries.FlyweightMap.names());

        LinkedList<String> linkedList = new LinkedList<String>(Countries.FlyweightMap.names());

        Iterator<String> aiter = arrays.iterator();

        Iterator<String> liter = linkedList.iterator();

        while (aiter.hasNext()) {
            System.out.println(aiter.next());
        }

        while (liter.hasNext()) {
            System.out.println(liter.next());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

//        ListIterator<String> al = arrays.listIterator();
//        ArrayList<String> newa = new ArrayList<String>();
//
//        ListIterator<String> ll = linkedList.listIterator();
//        LinkedList<String> newl = new LinkedList<String>();
        List<String> ll = new LinkedList<String>(Countries.FlyweightMap.names(6));
        System.out.println(ll);
        List<String> al = new ArrayList<String>(Countries.FlyweightMap.names(6));
        System.out.println(al);
        ListIterator<String> lit = ll.listIterator();
        ListIterator<String> lit2 = al.listIterator();
        while (lit.hasNext()) {
            lit.next();
            if (lit.hasNext()) {
                String s = lit2.next();
                lit.add(s);
                System.out.print("s = " + s + "\t");
            }else {
                lit.add(lit2.next());
                break;
            }
        }
        System.out.println();
        System.out.println(ll);

    }
}
