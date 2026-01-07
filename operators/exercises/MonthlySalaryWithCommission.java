/*A used car dealership pays its sales staff a monthly salary of $1000, plus a commission
of $150 for each car sold, plus 5% of the sale price per car. Each month, the company's
data entry clerk enters the relevant data into the computer. Write a program that
calculates and prints the monthly salary of a given salesperson.*/

import java.util.Scanner;

public class MonthlySalaryWithCommission {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  carsSold;
        double totalSales;
        double percentageCommission;
        double carCommission;
        double salary;
        System.out.print("Enter total sales amount: ");
        totalSales = input.nextDouble();
        
        System.out.print("Enter the number of cars sold in the month: ");
        carsSold = input.nextInt();
        
        carCommission = carsSold * 150;
        percentageCommission = totalSales * 0.05;
        
        salary = 1000 + carCommission + percentageCommission; 
        
        System.out.println("\n--- Monthly salary ---");
        System.out.println("Base salary: $1000");
        System.out.println("commission for cars sold: $" + carCommission);
        System.out.println("5% sales commission: $" + percentageCommission);
        System.out.println("Total monthly salary: $" + salary);
        
        input.close();
    }
}
