package Multi_Threading;

public class MultiThreading extends Thread {

    @Override
    public void run() {
        System.out.println("My Thread is in Running State");
    }

    public static void main(String[] args) throws InterruptedException {
        MultiThreading obj= new MultiThreading();
        obj.run();
    }
}
