package arrays.practise;

import arrays.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Practise1 {


   public ArrayList<String>  arrays(int size){
       if (size <= 0){
           size = 0;
       }
       ArrayList<String> a = new ArrayList<String>();
       for (int i = 0; i < size; i++){
           a.add(Countries.DATA[i][0]);
       }
       System.out.println("随机打乱前： " + a);
       Collections.shuffle(a);
       System.out.println("第一次打乱： " + a);
       Collections.shuffle(a);
       System.out.println("第二次打乱： " + a);
       Collections.shuffle(a);
       System.out.println("第三次打乱： " + a);
       Collections.shuffle(a);
       System.out.println("第四次打乱： " + a);
       System.out.println("+++++++++++++++++++++++++++++++++");
       return a;
   }

    public LinkedList<String>  linkeds(int size){
        if (size <= 0){
            size = 0;
        }
        LinkedList<String> l = new LinkedList<String>();
        for (int i = 0; i < size; i++){
            l.add(Countries.DATA[i][0]);
        }
        System.out.println("随机打乱前： " + l);
        Collections.shuffle(l);
        System.out.println("第一次打乱" + l);
        Collections.shuffle(l);
        System.out.println("第二次打乱" + l);
        Collections.shuffle(l);
        System.out.println("第三次打乱" + l);
        Collections.shuffle(l);
        System.out.println("第四次打乱" + l);


        return l;
    }



    public static void main(String[] args) {
        Practise1 p = new Practise1();
        p.arrays(3);
        p.arrays(3);

    }
}
