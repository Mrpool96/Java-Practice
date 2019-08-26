package JavaPractice;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        double num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        num1=sc.nextDouble();
        System.out.println("Enter the Number");
        num2=sc.nextDouble();
        System.out.println("Enter An Operator(+,-,*,/):-");
        char operator=sc.next().charAt(0);
        sc.close();
        double output;
        switch (operator){
            case'+':
                output=num1+num2;
                break;
            case'-':
                output=num1+num2;
                break;
            case'*':
                output=num1*num2;
                break;
            case'/':
                output=num1/num2;
                break;
                default:
                    System.out.println("You Have Entered A Wrong Operator");
                    return;
        }
        System.out.println(num1+" "+operator+" "+num2+":- "+output);
    }
}
