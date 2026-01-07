/*Write a program that calculates the square of a sum.
(a + b)^2 = a^2 + b^2 + 2ab*/

import java.util.Scanner;

public class SquareOfSumCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, result;
        
        System.out.print("Enter the value of 'a': ");
        a = input.nextDouble();
        
        System.out.print("Enter the value of 'b': ");
        b = input.nextDouble();
        
        result = Math.pow(a, 2) + Math.pow(b, 2) +(2 * a * b);
        
        System.out.println("\n--- Result of the square of a sum ---");
        System.out.println("Formula: (a + b)^2 = a^2 + b^2 + 2ab");
        System.out.println("The value of 'a': " + a);
        System.out.println("The value of 'b': " + b);
        System.out.println("Result of the operation: " + result);
    }
}
