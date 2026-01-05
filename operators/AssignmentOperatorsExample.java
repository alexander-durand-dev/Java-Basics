public class AssignmentOperatorsExample {

    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 20;
        int number3 = 20;
        int number4 = 20;
        int number5 = 20;
        
        number1 += 5; //number1 = number1 + 5;
        number2 -= 5; //number2 = number2 - 5;
        number3 *= 5; //number3 = number3 * 5;
        number4 /= 5; //number4 = number4 / 5;
        number5 %= 5; //number5 = number5 % 5;
        
        System.out.println("\n---Results---");
        System.out.println("Initial value: 20");
        System.out.println("After += 5: " + number1);
        System.out.println("After -= 5: " + number2);
        System.out.println("After *= 5: " + number3);
        System.out.println("After /= 5: " + number4);
        System.out.println("After %= 5: " + number5);
    }
}
