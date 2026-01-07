/*Write a program that, given a total number of minutes, converts and displays
the equivalent number of weeks, days, hours, and minutes.
The program should break down the total minutes into these time units
and print the result in a readable format.*/

import java.util.Scanner;

public class MinutesToWeeksDaysHoursMinutes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMinutes, remainingMinutes, weeks, days, hours, minutes;
        
        System.out.print("Enter the total number of minutes: ");
        totalMinutes = input.nextInt();
        
        weeks = totalMinutes / (7 * 24 * 60);
        remainingMinutes = totalMinutes % (7 * 24 * 60);
        
        days = remainingMinutes / (24 * 60);
        remainingMinutes = remainingMinutes % (24 * 60);
        
        hours = remainingMinutes / 60;
        minutes = remainingMinutes % 60;
        
        System.out.println("\n--- Result ---");
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Format together: " + weeks + " weeks, " + days + " days, " + hours + " hours, " + minutes + " minutes.");
        
        input.close();
    }
}
