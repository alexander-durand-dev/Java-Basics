/*Write a program that calculates and prints an employee´s weekly salary
based on their weekly hours worked and their hourly wage.*/

import java.util.Scanner;

public class WeeklySalaryCalculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hoursWorked, hourlyRate, weeklySalary;
        
        System.out.print("Enter your hours worked during the week: ");
        hoursWorked = input.nextDouble();
        
        System.out.print("Enter your hourly wage: ");
        hourlyRate = input.nextDouble();
        
        weeklySalary = hoursWorked * hourlyRate;
        
        System.out.println("\nWeekly salary is: $" + weeklySalary);
        
        input.close();
    }  
}
