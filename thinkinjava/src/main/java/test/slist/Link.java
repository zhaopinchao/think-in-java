package test.slist;

public class Link<T> {

    Link<T> next;
    T t;

    public Link(T t, Link<T> next){
        this.t = t;
        this.next = next;
    }

    public Link(T t){
        this(t, null);
    }

    public String toString(){
        if (t != null){
            return t.toString();
        } else {
            return "null";
        }
    }
}
