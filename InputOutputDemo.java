import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int integerInput = scanner.nextInt();

        // Taking decimal input
        System.out.print("Enter a decimal number: ");
        double decimalInput = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        // Taking string input
        System.out.print("Enter a word or sentence: ");
        String stringInput = scanner.nextLine();

        // Displaying the output
        System.out.println("Your integer: " + integerInput);
        System.out.printf("Your decimal number: %.2f%n", decimalInput);
        System.out.println("Your string: " + stringInput);

        scanner.close();
    }
}
