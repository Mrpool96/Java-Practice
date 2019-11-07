package MultiThreading;

public class Threading {
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<8;i++){
            Multi_Thread obj=new Multi_Thread();
            obj.start();
        }
    }
}
