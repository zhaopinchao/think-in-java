package arrays.practise;

import java.util.Iterator;
import java.util.LinkedList;

public class Practise10 {
    public static void main(String[] args) {
        SortedSet<String> strings = new SortedSet<String>();
        strings.add("abc");
        strings.add("aac");
        strings.add("acc");
        System.out.println(strings);
    }
}

class SortedSet<T> extends LinkedList<T> {
    int compare(T t1, T t2){
        return t1.hashCode() < t2.hashCode() ? 1 : (t1.hashCode() == t2.hashCode() ? 0 : -1);
    }
    public boolean add(T t) {
        if (this.isEmpty()) {
            add(0, t);
        }
        if (!this.contains(t)) {
            Iterator<T> it = this.iterator();
            int index = 0;
            while (it.hasNext()){
                T t1 = it.next();
                if (compare(t1, t) == 1){

                }else if(compare(t1, t) == -1){
                    index++;
                }else{
                    throw new RuntimeException();
                }
            }
            add(index, t);
            return true;
        }
        return false;
    }
}