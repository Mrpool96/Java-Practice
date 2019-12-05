package OOPS_Concept.Inheritance.Polymorphism;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Barks");
    }

    public static void main(String[] args) {
        Animal obj= new Dog();
        obj.sound();
    }
}
