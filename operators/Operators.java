import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float number1, number2, addition, subtraction, multiplication, division, modulo;
        
        System.out.print("Enter 2 numbers: ");
        number1 = input.nextFloat();
        number2 = input.nextFloat();
        
        addition = number1 + number2;
        subtraction = number1 - number2;
        division = number1 / number2;
        multiplication = number1 * number2;
        modulo = number1 % number2;
        
        System.out.println("\n---Operators---");
        System.out.println("The sum is: " + addition);
        System.out.println("The subtraction is: " + subtraction);
        System.out.println("The multiplication is: " + multiplication);
        System.out.println("The division is: " + division);
        System.out.println("The remainder is: " + modulo);
        
        input.close();
    }  
}
