package JavaPractice;

public class dog extends Abstraction {
    @Override
    public void sound() {
        System.out.println("Wooof");
    }

    public static void main(String[] args) {
        Abstraction obj=new dog();
        obj.sound();
    }
}
