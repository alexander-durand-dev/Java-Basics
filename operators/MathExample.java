public class MathExample {

    public static void main(String[] args) {
        double number = 9.5;
        
        System.out.println("\n---Math Class Example---");
        System.out.println("Number: " + number);
        
        System.out.println("Square root: " + Math.sqrt(number));
        System.out.println("Power (number^2): " + Math.pow(number, 2));
        System.out.println("Absolute value: " + Math.abs(-number));
        System.out.println("Rounded: " + Math.round(number));
        System.out.println("Floor: " + Math.floor(number));
        System.out.println("Ceil: " + Math.ceil(number));
        System.out.println("Random (0.0 to 1.0): " + Math.random());
        System.out.println("Max (number, 10): " + Math.max(number, 10));
        System.out.println("Min (number, 10): " + Math.min(number, 10));
    }
}
