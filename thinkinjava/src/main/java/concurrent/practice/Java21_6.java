package concurrent.practice;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Java21_6 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            exec.execute(new SleepingTask(i));
        }
        exec.shutdown();
    }
}
class SleepingTask implements Runnable{

    private int id;

    public SleepingTask(int id){
        this.id = id;
    }

    @Override
    public void run() {
        int time = (int)(Math.random()*10 + 1);
        try {
            Thread.sleep(time*1000);
            System.out.println(id + "#线程睡眠"+time+"秒；");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}