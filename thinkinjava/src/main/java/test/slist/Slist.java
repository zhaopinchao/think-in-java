package test.slist;


public class Slist<T> {

    private Link<T> headLink = new Link<T>(null);

    public SlistIterator<T> slistIterator(){
        return new SlistIterator(headLink);
    }

    @Override
    public String toString() {
        if (headLink == null) return "Slist []";
        SlistIterator<T> sl = this.slistIterator();
        StringBuilder sb = new StringBuilder();
        while (sl.hasNext()) {
            sb.append(sl.next());
            sb.append(sl.hasNext() ? "," : "");
        }
        return sb.toString();


    }
}
