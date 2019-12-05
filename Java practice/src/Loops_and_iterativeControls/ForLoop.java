package Loops_and_iterativeControls;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Loop:-");
        a=scanner.nextInt();
        for (int i=10;i>1;i--){
            System.out.println("loop"+a);
        }
    }
}
