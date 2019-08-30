package If_Expressions_And_Loops;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter The Number:-");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<=10){
            System.out.println("Then the number is true");
        }
    }
}
