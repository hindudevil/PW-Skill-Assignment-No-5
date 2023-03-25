//Q8. Write a program to print a triangle of prime numbers upto given number of lines of the triangle.

import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines for the triangle: ");
        int lines = input.nextInt();
        int number = 2;
        
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines - i; j++) {
                System.out.print(" ");
            }
            int count = 0;
            while (count < i) {
                boolean isPrime = true;
                for (int k = 2; k <= Math.sqrt(number); k++) {
                    if (number % k == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(number + " ");
                    count++;
                }
                number++;
            }
            System.out.println();
        }
    }
}
