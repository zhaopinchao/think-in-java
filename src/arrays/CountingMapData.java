package arrays;

import java.util.*;

public class CountingMapData extends AbstractMap<Integer, String> {


    private int size;

    private static String[] chars = "A B C D E F G H I J K M N L O P Q R S T U V W X Y Z".split(" ");

    public CountingMapData(int size) {
        if (size < 0) this.size = 0;
        this.size = size;
    }

    public CountingMapData() {
    }

    private static class Entry implements Map.Entry<Integer, String> {

        int index;

        Entry(int index) {
            this.index = index;
        }

        public boolean equals(Object o) {
            return Integer.valueOf(index).equals(o);
        }

        @Override
        public Integer getKey() {
            return index;
        }

        @Override
        public String getValue() {
            return chars[index % chars.length] + Integer.toString(index / chars.length);
        }

        @Override
        public String setValue(String value) {
            throw new UnsupportedOperationException();
        }

        public int hashCode() {
            return Integer.valueOf(index).hashCode();
        }
    }

    static class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {
        private int size;

        EntrySet(int size) {
            if (size < 0) {
                this.size = 0;
            } else if (size > chars.length) {
                this.size = chars.length;
            } else {
                this.size = size;
            }
        }

        public int size() {
            return size;
        }

        private class Iter implements Iterator<Map.Entry<Integer, String>> {

            private CountingMapData.Entry entry = new CountingMapData.Entry(-1);

            public boolean hasNext() {
                return entry.index < size - 1;
            }

            public Map.Entry<Integer, String> next() {
                entry.index++;
                return entry;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public Iterator<Map.Entry<Integer, String>> iterator() {
            return new CountingMapData.EntrySet.Iter();
        }
    }

    private Set<Map.Entry<Integer, String>> entries = new EntrySet(chars.length);

    public Set<Map.Entry<Integer, String>> entrySet() {
        return entries;
    }

    public static Map<Integer, String> select(final int size) {
        return new CountingMapData() {
            public Set<Map.Entry<Integer, String>> entrySet() {
                return new EntrySet(size);
            }
        };
    }

    /*@Override
    public Set<Map.Entry<Integer, String>> entrySet() {
        Set<Map.Entry<Integer, String>> entries = new LinkedHashSet<Map.Entry<Integer, String>>();
        for (int i = 0; i < size; i++){
            entries.add(new Entry(i));
        }
        return entries;
    }*/

    public static void main(String[] args) {
        System.out.println(new CountingMapData(60));
        System.out.println("++++++++++++++++++++++");
        System.out.println(select(30));
    }
}