package JavaPractice;

import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        num1=sc.nextInt();
        System.out.println("Enter the Number");
        num2=sc.nextInt();
        sc.close();
        sum=num1-num2;
        System.out.println("Substraction of the following Number is:-"+sum);
    }
}
