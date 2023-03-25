//Q9 Write a program to check whether a prime Number can be expressed as a Sum of Two Prime Numbers.

import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a prime number: ");
        int n = input.nextInt();

        if (n <= 2) {
            System.out.println("Input is not a valid prime number.");
        } else {
            boolean isPrime = true;

            // check whether n-2 is prime or not
            for (int i = 2; i <= Math.sqrt(n-2); i++) {
                if ((n-2) % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n + " can be expressed as a sum of two prime numbers: 2 and " + (n-2));
            } else {
                System.out.println(n + " cannot be expressed as a sum of two prime numbers.");
            }
        }
    }
}

