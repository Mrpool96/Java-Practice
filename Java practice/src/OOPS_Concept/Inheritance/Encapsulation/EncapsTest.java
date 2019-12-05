package OOPS_Concept.Inheritance.Encapsulation;

public class EncapsTest {
    public static void main(String[] args) {
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setEmpName("Sagar");
        obj.setSsn(001);
        obj.setEmpAge(23);
        System.out.println("Employee Name: "+obj.getEmpName());
        System.out.println("Employee SSN: "+obj.getSsn());
        System.out.println("Employee Age: "+obj.getEmpAge());
    }
}
