package Multi_Threading;

public class Thread_Demo extends Thread {
    Thread t;

    public void run() {
        for (int i = 0; i < 4; i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args)throws Exception {


            Thread_Demo obj = new Thread_Demo();
            Thread_Demo obj1 = new Thread_Demo();
            Thread.sleep(1000);
            obj.start();
            obj1.join();

    }
}