/*The final grade of a Computer Science student is calculated based on the grades of four
aspects of their academic performance: participation, first midterm exam, second midterm
exam, and final exam. Knowing that these grades contribute to the final grade with 
weights of 10%, 25%, 25%, and 40% respectively, write a program that calculates
and prints the final grade obtained by a student.*/

import java.util.Scanner;

public class FinalGradeCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float participation, firstMidtermExam, secondPartialExam, finalExam, finalGrade;
        
        System.out.print("Enter your participation grade: ");
        participation = input.nextFloat();
        
        System.out.print("Enter the grade for your first Midterm Exam: ");
        firstMidtermExam = input.nextFloat();
        
        System.out.print("Enter your second partial Exam grade: ");
        secondPartialExam = input.nextFloat();
        
        System.out.print("Enter your grade final exam: ");
        finalExam = input.nextFloat();
        
        participation *= 0.10f;
        firstMidtermExam *= 0.25f;
        secondPartialExam *= 0.25f;
        finalExam *= 0.40f;
        
        finalGrade = participation + firstMidtermExam + secondPartialExam + finalExam;
        
        System.out.println("\n--- Grades ---");
        System.out.println("Participation: " + participation);
        System.out.println("First Midterm Exam: " + firstMidtermExam);
        System.out.println("Second Partial Exam: " + secondPartialExam);
        System.out.println("final Exam: " + finalExam);
        System.out.println("final grade: " + finalGrade);
        
        input.close();
    }
}
