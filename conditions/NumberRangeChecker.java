/*Write a program that asks the user to enter an integer number.
The program should determine and display whether the number:
- Is less than 0
- Is between 0 and 50
- Is between 51 and 100
- Is greater than 100*/

import javax.swing.JOptionPane;

public class NumberRangeChecker {

    public static void main(String[] args) {
        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));

        if (number < 0) {
            JOptionPane.showMessageDialog(null, "The number is less than 0.");
        } 
        else if (number <= 50) {
            JOptionPane.showMessageDialog(null, "The number is between 0 and 50.");
        } 
        else if (number <= 100) {
            JOptionPane.showMessageDialog(null, "The number is between 51 and 100.");
        } 
        else {
            JOptionPane.showMessageDialog(null, "The number is greater than 100.");
        }
    }
}
