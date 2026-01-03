import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;
        int age;
        double height;
        char gender;
        
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter your age: ");
        age = input.nextInt();
        
        System.out.print("Enter your height: ");
        height = input.nextDouble();
        
        System.out.print("Enter your gender (M/F): ");
        gender = input.next().charAt(0);
         
        System.out.println("\n---Data entered---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        
        input.close();
    }
}
