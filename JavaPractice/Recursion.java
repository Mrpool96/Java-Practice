package JavaPractice;

public class Recursion {
    static int count=0;
    static void p() {
        count++;
        if (count<=10) {
            System.out.println("Hello:-" + count);
            p();
        }
    }

    public static void main(String[] args) {
        p();
    }
}
