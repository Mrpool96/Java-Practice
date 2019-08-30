package If_Expressions_And_Loops;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the Number:-");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        sc.close();
    do{
        System.out.println(a);
        a--;
        }
    while (a>1);

    }
}
