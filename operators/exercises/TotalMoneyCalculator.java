/*Guillermo has N dollars.
Luis has half of what Guillermo has.
Juan has half of what Luis and Guillermo have together.
Write a program that calculates and prints the total amount 
of money the three of them have.*/

import java.util.Scanner;

public class TotalMoneyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double guillermoMoney, juanMoney, luisMoney, totalMoney;
        
        System.out.print("Enter the amount of money Guillermo has: ");
        guillermoMoney = input.nextDouble();
        
        luisMoney = guillermoMoney / 2;
        
        juanMoney = (guillermoMoney + luisMoney) / 2;
        
        totalMoney = guillermoMoney + luisMoney + juanMoney;
        
        System.out.println("\n---Each person´s money---");
        System.out.println("Guillermo´s Money: $" + guillermoMoney);
        System.out.println("Luis´s Money: $" + luisMoney);
        System.out.println("Juan´s Money: $" + juanMoney);
        System.out.println("Total amount of money: $" + totalMoney);
        
        input.close();
    }
}
