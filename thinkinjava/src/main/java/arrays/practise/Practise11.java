package arrays.practise;

import java.util.PriorityQueue;

public class Practise11 extends PriorityQueue<Practise11.Item> {

    static class Item implements Comparable<Item>{

        private Integer integer;

        public Item() {
            Integer i = (int)(Math.random()*100);
            integer = i;
        }

        @Override
        public int compareTo(Item o) {
            if(integer > o.integer) {
                return +1;
            }
            if(integer == o.integer) {
                return 0;
            }
            return -1;
        }

        @Override
        public String toString() {
            return integer+" ";
        }
    }

    public void add(){
        super.add(new Item());
    }

    public static void main(String[] args) {
        Practise11 p = new Practise11();
        for (int i = 0; i < 100; i++) {
            p.add();
        }
        while(!p.isEmpty()){
            System.out.println(p.poll());
        }
    }
}
