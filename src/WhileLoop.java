import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        WhileLoop wl = new WhileLoop(); // Create an instance of the class
        wl.showHello(); // Call the showHello method
    }

    Scanner sc = new Scanner(System.in);

    void showHello() {
        String choice;

        System.out.println("For Hello type h, anything else to stop");
        choice = sc.next();

        while ("h".equalsIgnoreCase(choice)) {
            System.out.println("Hello");
            System.out.println("Type 'h' to see Hello again, anything else to stop:");
            choice = sc.next();
        }
    }
}
