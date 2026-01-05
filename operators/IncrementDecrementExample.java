public class IncrementDecrementExample {

    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int z;
        int a;
        
        x++;        // x = 6
        y--;        // y = 4
        z = ++x;    // x = 7, z = 7
        a = y--;    // a = 4, y = 3;
        
        System.out.println("\n---Results---");
        System.out.println("Initial values: x = 5, y = 5\n");
        System.out.println("Final value of x: " + x);
        System.out.println("Final value of y: " + y);
        System.out.println("Value of z (pre-increment): " + z);
        System.out.println("Value of a (post-decrement): " + a);
    }  
}
