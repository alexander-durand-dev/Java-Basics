/*Write a program that calculates and displays the real roots of a quadratic equation
with real coefficients. The quadratic equation has the form:

    ax² + bx + c = 0

The program should ask the user to enter the values of a, b, and c, then compute
and print the two real solutions using the quadratic formula.*/

import java.util.Scanner;

public class QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, discriminant, x1, x2;
        
        System.out.print("Enter the value of 'a': ");
        a = input.nextDouble();
        
        System.out.print("Enter the value of 'b': ");
        b = input.nextDouble();
        
        System.out.print("Enter the value of 'c': ");
        c = input.nextDouble();
        
        discriminant = Math.pow(b, 2) - 4 * a * c;
        
        x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        
        x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        
        System.out.println("\n--- Result of the quadratic quation ---");
        System.out.println("First root (x1): " + x1);
        System.out.println("Second root (x2): " + x2);
        
        input.close();
    }
}
