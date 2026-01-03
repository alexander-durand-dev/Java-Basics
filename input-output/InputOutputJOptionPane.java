import javax.swing.JOptionPane;

public class InputOutputJOptionPane {

    public static void main(String[] args) {
        String name;
        int age;
        char gender;
        double height;
        
        name = JOptionPane.showInputDialog("Enter your name: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        gender = JOptionPane.showInputDialog("Enter your gender (M/F): ").charAt(0);
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height (e.g. 1.75): "));
        
        JOptionPane.showMessageDialog(null,
                "--- User Information ---\n" +
                "Name: " + name + "\n" + 
                "Age: " + age + "\n" +
                "Height: " + height + "\n" +
                "Gender: " + gender
        );
    }
}
