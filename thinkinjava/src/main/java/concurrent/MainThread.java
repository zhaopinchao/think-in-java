package concurrent;

public class MainThread {
    /**
     * 程序运行的时候并没有启动多个线程，也就是说这里只启动了一个main线程
     * @param args
     */
    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
    }
}
