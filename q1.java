//Q1 - Write a program to print Fibonacci series of n terms where n is input by user.

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int n, firstTerm = 0, secondTerm = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms you want to print: ");
        n = input.nextInt();
        System.out.println("Fibonacci Series of " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
