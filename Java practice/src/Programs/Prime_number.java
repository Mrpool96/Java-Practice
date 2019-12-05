package Programs;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        int temp;
        Boolean isPrime=true;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number:-");
        int num=scanner.nextInt();
        scanner.close();
        for (int i=2;i<=num;i++){
            temp=num%i;
            if(temp==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+ " is a Prime Number");

        }
        else {
            System.out.println(num+ " is not a Prime Number");
        }
    }

}
