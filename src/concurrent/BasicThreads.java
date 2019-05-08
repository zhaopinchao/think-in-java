package concurrent;

public class BasicThreads {
    /**
     * 程序运行的时候启动了两个线程一个是main线程，一个是t线程
     * @param args
     */
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for liftOff");
    }
}
