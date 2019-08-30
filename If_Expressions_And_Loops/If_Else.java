package If_Expressions_And_Loops;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the Number:-");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>=40){
            System.out.println("Following Student is Pass");
        }
        else{
            System.out.println("Following Student Is Fail");
        }
    }
}
