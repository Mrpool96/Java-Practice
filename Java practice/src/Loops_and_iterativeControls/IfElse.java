package Loops_and_iterativeControls;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:-");
        a = sc.nextInt();
        if (a >= 40) {
            System.out.println("Passed");
        }
        else{
            System.out.println("student is failed");
        }
    }
}