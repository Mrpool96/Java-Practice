package Exception_Handling;

public class ExceptionEx {
    public static void main(String[] args) {
        int num1,num2;
        try {
            num1=0;
            num2=62/num1;
            System.out.println(num2);
            System.out.println("I'm At The End Of Try Block");
        }
        catch (ArithmeticException e){
            System.out.println("You Should Not Divide A Numer By Zero");

        }
        catch (Exception e){
            System.out.println("Exception Occured");

        }
        System.out.println("I'm Out Of Try And catch Block");
    }
}
