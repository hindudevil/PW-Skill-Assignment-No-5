/*Q2 - Write a program to enter the numbers till the user wants, the number can be positive,negative or zero. 
Calculate the sum of numbers until a negative number is encountered.If the input is a negative number, current sum
 is discarded and print -1.*/

 import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (positive, negative, or zero): ");
            number = input.nextInt();

            if (number < 0) {
                System.out.println("-1");
                break;
            } else {
                sum += number;
            }
        }

        System.out.println("Sum of numbers entered before negative number: " + sum);
    }
}
