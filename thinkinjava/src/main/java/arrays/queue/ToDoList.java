package arrays.queue;

import java.util.PriorityQueue;

public class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
    static class ToDoItem implements Comparable<ToDoItem>{
        private char primary;
        private int secondary;
        private String item;

        public ToDoItem(String td, char pri, int sec){
            this.item = td;
            this.primary = pri;
            this.secondary = sec;
        }

        @Override
        public int compareTo(ToDoItem o) {
            if (primary > o.primary){
                return +1;
            }
            if(primary == o.primary){
                if(secondary > o.secondary){
                    return +1;
                }else if(secondary == o.secondary){
                    return 0;
                }
            }
            return -1;
        }
    }
}
