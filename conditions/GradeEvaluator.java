/*Write a program that asks the user to enter a numeric grade (0–100).
The program should evaluate the grade and display the corresponding letter grade:
- A (90–100)
- B (80–89)
- C (70–79)
- D (60–69)
- F (below 60)*/

import javax.swing.JOptionPane;

public class GradeEvaluator {

    public static void main(String[] args) {
        double grade;
        
        grade = Double.parseDouble(JOptionPane.showInputDialog("Enter a numerical grade (0 - 100): "));
        
        if(grade < 0 || grade > 100){
            JOptionPane.showMessageDialog(null, "Invalid grade");
        }
        else if(grade < 60){
            JOptionPane.showMessageDialog(null, "F");
        }
        else if(grade < 70){
            JOptionPane.showMessageDialog(null, "D");
        }
        else if(grade < 80){
            JOptionPane.showMessageDialog(null, "C");
        }
        else if(grade < 90){
            JOptionPane.showMessageDialog(null, "B");
        }
        else{
            JOptionPane.showMessageDialog(null, "A");
        }
    }  
}
