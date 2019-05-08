package arrays;

import java.util.AbstractList;

public class CountingIntegerList extends AbstractList<Integer> {

    private int size;

    public  CountingIntegerList(int size){
        this.size = size < 0 ? 0 : size;
    }

    @Override
    public Integer get(int index) {
        return Integer.valueOf(index);
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CountingIntegerList c = new CountingIntegerList(30);
        Integer i = c.get(3);
        Integer size = c.size;
        System.out.println(i);
        System.out.println(size);
        System.out.println(c);


    }
}
