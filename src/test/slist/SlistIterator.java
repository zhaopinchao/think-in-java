package test.slist;

public class SlistIterator<T> {
    //insert remove hasnext
    Link<T> current;

    public SlistIterator(Link<T> headLink) {
        this.current = headLink;
    }

    public boolean hasNext(){
        return current.next != null;
    }

    public void insert(T t){
        current.next = new Link<T>(t, current.next);
        current = current.next;
    }

    public Link<T> next(){
        return current = current.next;
    }

    public void remove(){
        if (hasNext()){
            current.next = current.next.next;
        }
    }
}
