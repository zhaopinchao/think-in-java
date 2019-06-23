package concurrent.practice;

public class Java21_1 {

    public static void main(String[] args) {
        int i = 100;
        while(i-- > 0){
            new Thread(new Java21_1.Task()).start();
        }
    }

    static class Task implements Runnable{
        private static int taskCount=0;
        private final int id = taskCount++;
        @Override
        public void run() {
            for (int i = 0; i < 3; i++){
                System.out.println("正在执行任务# " + id);
                Thread.yield();
            }

        }
    }
}
