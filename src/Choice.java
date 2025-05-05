import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You can enroll to this program");
        } else if (age < 18) {
            System.out.println("You cannot enroll to this program");
        } else {
            System.out.println("You just got lucky");
        }

        sc.close();
    }
}

