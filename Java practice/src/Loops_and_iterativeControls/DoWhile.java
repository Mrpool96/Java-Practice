package Loops_and_iterativeControls;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        a=scanner.nextInt();
        do{
            System.out.println(a);
            a--;
        }while (a>1);
    }
}
