//Q4- Write a program to print all Armstrong numbers between 1 to n.

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int number, remainder, sum, digits;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();
        System.out.println("Armstrong numbers between 1 and " + number + ":");
        
        for (int i = 1; i <= number; i++) {
            digits = 0;
            sum = 0;
            int temp = i;
            
            // count number of digits in the current number
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            
            temp = i;
            
            // calculate sum of cubes of digits
            while (temp > 0) {
                remainder = temp % 10;
                sum += Math.pow(remainder, digits);
                temp /= 10;
            }
            
            // check if the sum is equal to the number itself
            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}
