package Loops_and_iterativeControls;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:-");
        a=scanner.nextInt();
        while (a<10){
            System.out.println(a);
            a--;
        }
    }
}
