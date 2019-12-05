package Programs;

import java.util.Scanner;

public class Fibonacci_serise {
    public static void main(String[] args) {
        int count,num1=0,num2=1;
        System.out.println("how do you number want in the Sequence");
        Scanner scanner=new Scanner(System.in);
        count=scanner.nextInt();
        scanner.close();
        System.out.println("Fibonacci Serise of " +count+ " numbers is:-");
        int i=1;
        while (i<=count){
            System.out.println(num1+ "  ");
            int sumOfPrevtwo=num1+num2;
            num1=num2;
            num2=sumOfPrevtwo;
            i++;
        }

    }
}
