package OOPS_Concept.Inheritance;

public class Members extends Avengers {
    String mainAvenger="Tony-Stark";

    public static void main(String[] args) {
        Members obj= new Members();
        System.out.println(obj.mainAvenger);
        System.out.println(obj.Designation);
        System.out.println(obj.Address);
        obj.does();

    }

}
