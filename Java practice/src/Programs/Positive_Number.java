package Programs;

import java.util.Scanner;

public class Positive_Number {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the Number");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        if (a>0){
            System.out.println("Given number " +a+ "is Positive Number");
        }
        else if(a<0){
            System.out.println("Given number " +a+ "is Negative Number");

        }
        else {
            System.out.println("Number is neither positive nor negative");
        }

    }
}
