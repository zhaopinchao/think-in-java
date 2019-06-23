package arrays.arrayssourcecode;

import java.util.*;

public class MpaTest {
    /**
     * 1.HashMap 是一个数组加链表的数据结构
     * 2.HashMap的初始容量是16，最大容量是Integer.Max
     * 3.当HashMap单个节点链表上的数量 >= 8并且hashMap.length > 64 时，HashMap会将该链表转换成红黑树
     * 4.当HashMap单个节点红黑树的节点数量 <= 6个时，HashMap会将该红黑树转换成链表
     */
    HashMap hashMap;

    /**
     * 1.TreeMap的数据结构是红黑树
     * 2.TreeMap中通过比较器（Comparator）来决定存放数据的位置，比较器可以是默认的也可以自定义
     */
    TreeMap treeMap;

    /**
     * 1.LinkedHashMap在HashMap的基础上实现了循环双向列表，LinkedHashMap的节点组成中加入了before, after
     * 2.LinkedHashMap的迭代方式有两种，一种是插入顺序迭代，一种是访问顺序迭代
     * 3.如果LinkedHashMap需要按照访问循序迭代的话需要使用这个构造器public LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
     * 4.LinkedHashMap迭代的默认顺序是插入的顺序
     */
    LinkedHashMap linkedHashMap;

    SortedMap sortedMap;

    SortedSet sortedSet;

    public static void main(String[] args) {
        testLinkedHashMap();
    }

    public static void testLinkedHashMap(){
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap(16,
        0.75f,
        true);
        linkedHashMap.put("java1","java1");
        linkedHashMap.put("java2","java2");
        linkedHashMap.put("java3","java3");
        linkedHashMap.put("java4","java4");
        linkedHashMap.put("java5","java5");
        linkedHashMap.put("java6","java6");
        linkedHashMap.put("java7","java7");
        linkedHashMap.put("java8","java8");
        linkedHashMap.put("java9","java9");
        linkedHashMap.put("java10","java10");
        System.out.println(linkedHashMap);
        StringBuffer putBuffer = new StringBuffer();
        Iterator iterator = linkedHashMap.keySet().iterator();
        linkedHashMap.get("java6");
        System.out.println(linkedHashMap);
    }

}
