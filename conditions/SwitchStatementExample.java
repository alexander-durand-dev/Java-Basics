/*
 This program demonstrates the use of the switch statement in Java.

 General syntax:

 switch(variable) {
     case value1: 
         instructions;
         break;
     case value2: 
         instructions;
         break;
     default:
         instructions;
         break;
 }
*/

import javax.swing.JOptionPane;

public class SwitchStatementExample {

    public static void main(String[] args) {
        int number;
        
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 1-5: "));
        
        switch(number){
            case 1: JOptionPane.showMessageDialog(null, "It's number 1");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "It's number 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "It's number 3");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "It's number 4");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "It's number 5");
                    break;
            default: JOptionPane.showMessageDialog(null, "The number is not in the range of 1-5");
                    break;
        }
    }   
}