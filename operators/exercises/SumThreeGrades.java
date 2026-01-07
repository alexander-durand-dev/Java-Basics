/*Write a program that calculates and prints the sum of three 
grades.*/

import java.util.Scanner;

public class SumThreeGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float grade1, grade2, grade3, sum;
        
        System.out.print("Enter the first grade: ");
        grade1 = input.nextFloat();
        
        System.out.print("Enter the second grade: ");
        grade2 = input.nextFloat();
        
        System.out.print("Enter the third grade: ");
        grade3 = input.nextFloat();
        
        sum = grade1 + grade2 + grade3;
        
        System.out.println("\nThe sum of the grades is: " + sum);
        
        input.close();
    }
}
