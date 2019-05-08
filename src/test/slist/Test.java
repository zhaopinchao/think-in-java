package test.slist;

public class Test {
    public static void main(String[] args) {
        Slist<String> a = new Slist<String>();
        SlistIterator<String> sl = a.slistIterator();
        sl.insert("fsd");
        sl.insert("qwe");
        sl.insert("werw");
        SlistIterator<String> sl2 = a.slistIterator();
        System.out.println(sl2.hasNext());
        //sl2.remove();
        System.out.println(a);
        System.out.println(sl.current);
    }
}
