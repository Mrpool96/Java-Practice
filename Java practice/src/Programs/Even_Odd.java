package Programs;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        int a;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Number:-");
        a=scanner.nextInt();
        if(a%2==0){
            System.out.println("Given Number "+a+ " is Even number");

        }
        else {
            System.out.println("Given Number is " +a+  " Odd is Number");
        }
    }
}
