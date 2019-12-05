package Programs;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        int num, temp, number, total = 0;
        System.out.println("Enter the Three Digit Number:-");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        number = num;
        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total+temp * temp * temp;
        }
        if (total == num) {
            System.out.println(num + " Is an ArmStrong Number");

        } else {
            System.out.println(num + " Is not an ArmStrong Number");
        }
    }
}
