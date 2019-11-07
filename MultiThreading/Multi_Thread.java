package MultiThreading;

public class Multi_Thread extends Thread {
    public void run(){
        try{
        System.out.println("Thread"+
                Thread.currentThread().getId()+"is running");
                Thread.sleep(100);

    }
        catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
