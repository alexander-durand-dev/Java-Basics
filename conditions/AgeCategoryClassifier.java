/*Write a program that asks the user to enter their age.
The program should classify the person into one of the following categories:
- Child (0–12 years)
- Teenager (13–17 years)
- Adult (18–64 years)
- Senior (65 years and older)
Then display a message indicating the age category.*/

import javax.swing.JOptionPane;

public class AgeCategoryClassifier {

    public static void main(String[] args) {
        int age;
        
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        
        if(age >= 0 && age <= 12){
            JOptionPane.showMessageDialog(null, "Child");
        }
        else if(age <= 17){
            JOptionPane.showMessageDialog(null, "Teenager");
        }
        else if (age <= 64){
            JOptionPane.showMessageDialog(null, "Adult");
        }
        else{
            JOptionPane.showMessageDialog(null, "Senior");
        }
    }
}
