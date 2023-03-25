import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.print("Enter your height (in meters): ");
            double height = scanner.nextDouble();

            System.out.println("Your name is " + name + ".");
            System.out.println("Your age is " + age + ".");
            System.out.println("Your height is " + height + " meters.");
        }
    }
}
