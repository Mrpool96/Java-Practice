package OOPS_Concept.Inheritance.Abstraction;

public class Assemble extends Avengers {
    @Override
    public void sound() {
        System.out.println("Avengers Assemble");
    }

    public static void main(String[] args) {
        Avengers obj=new Assemble();
        obj.sound();
    }
}
