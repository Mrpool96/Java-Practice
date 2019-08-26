package JavaPractice;
import java.util.Scanner;

    public class IfElse_Expression {
        public static void main(String[] args) {
            int Marks;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter The Number:-");
            Marks=sc.nextInt();
            if(Marks>=40) {
                System.out.println("Student Is Pass");
            }
            else
                System.out.println("Student Is Fail");

        }
    }

