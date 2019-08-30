package Exception_Handling;

public class ThrowException {
    static void CheckAbility(int studAge, int studWeight){
        if(studAge<12&&studWeight<40){
            throw new ArithmeticException("Student Is not Eligible For Registration");
        }
        else
        {
            System.out.println("Student Entry is Valid");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Registration Process");
        CheckAbility(10,30);
        System.out.println("Have a nice day...");
    }
}
