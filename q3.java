//Q3- Write a program to calculate the factorial of a number.

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int number, factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
