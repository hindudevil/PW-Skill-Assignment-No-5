//Q6- Write a program to print alphabet diamond pattern:

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        char currentChar = 'A';
        int size, numSpaces, numChars;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the diamond pattern: ");
        size = input.nextInt();
        numSpaces = size - 1;
        numChars = 1;

        for (int i = 1; i <= 2 * size - 1; i++) {
            for (int j = 1; j <= numSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= numChars; j++) {
                System.out.print(currentChar);
                if (j < numChars) {
                    currentChar++;
                } else {
                    currentChar--;
                }
            }

            System.out.println();
            if (i < size) {
                numSpaces--;
                numChars += 2;
                currentChar = (char) ('A' + i);
            } else {
                numSpaces++;
                numChars -= 2;
                currentChar = (char) ('A' + 2 * size - i - 2);
            }
        }
    }
}

