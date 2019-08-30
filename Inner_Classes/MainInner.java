package Inner_Classes;

public class MainInner {
     static void main(String[] args) {
        InnerClass.Inner in = new InnerClass().new Inner();
        in.show();
    }
}