package If_Expressions_And_Loops;

import java.util.Scanner;

public class Whlle_Loop {
    public static void main(String[] args) {
    int a;
        System.out.println("Enter the Number:-");
        Scanner sc=new Scanner (System.in);
        a=sc.nextInt();
        sc.close();
        while(a<10){
            System.out.println("House party Protocol Initiated!!");
            break;

        }
    }
}
