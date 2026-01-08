import javax.swing.JOptionPane;

public class ConditionalExample {
    
    public static void main(String[] args) {
        int number, targetNumber = 5;
        
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        
        /*
        == : Equality
        != : Not equal to
        >  : Greater than
        >= : Greater than or equal to
        <  : Less than
        <= : Less than or equal to
        */
        
        if(number == targetNumber){
            JOptionPane.showMessageDialog(null, "The number is equal to 5.");
        }
        else{
            JOptionPane.showMessageDialog(null, "The number is different from 5.");
        }
    }
}
