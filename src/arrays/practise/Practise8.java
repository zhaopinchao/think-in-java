package arrays.practise;

class Link<T> {
    Link<T> next;
    T t;

    public Link(T t, Link<T> next) {
        this.next = next;
        this.t = t;
    }

    public Link(T t) {
        this(t, null);
    }

    public String toString() {
        if (t == null) return "null";
        else return t.toString();
    }
}

class SList<T> {
    private Link<T> headLink = new Link<T>(null);

    public SListIterator<T> sListIterator() {
        return new SListIterator<T>(headLink);
    }

    public String toString() {
        if (headLink.next == null) return "SList: []";
        SListIterator<T> sl = this.sListIterator();
        StringBuilder sb = new StringBuilder();
        while (sl.hasNext()) {
            sb.append(sl.next());
            sb.append(sl.hasNext() ? "," : "");
        }
        return sb.toString();
    }
}

class SListIterator<T> {
    Link<T> current;

    public SListIterator(Link<T> headLink) {
        current = headLink;
    }

    public boolean hasNext() {
        return (current.next != null);
    }

    public void insert(T t) {
        current.next = new Link<T>(t, current.next);
        current = current.next;
    }

    public Link<T> next() {
        return current = current.next;
    }

    public void remove() {
        if (current.next != null) current.next = current.next.next;
    }
}

public class Practise8 {
    public static void main(String[] args) {
        SList<String> a = new SList<String>();
        SListIterator<String> sl = a.sListIterator();
//        sl.insert("fsd");
//        sl.insert("qwe");
//        sl.insert("werw");
        SListIterator<String> sl2 = a.sListIterator();
        System.out.println(sl2.hasNext());
        //sl2.remove();
        System.out.println(a);
    }
}
