import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get a valid SSN
        String ssn = getRegExString(scanner, "Enter your SSN (xxx-xx-xxxx): ", "^\\d{3}-\\d{2}-\\d{4}$");

        // Get a valid UC Student M Number
        String mNumber = getRegExString(scanner, "Enter your UC Student M number (Mxxxxx): ", "^(M|m)\\d{5}$");

        // Get a valid menu choice
        String menuChoice = getRegExString(scanner, "Enter your menu choice (O/S/V/Q): ", "^[OoSsVvQq]$");

        // Display the collected values
        System.out.println("Valid SSN: " + ssn);
        System.out.println("Valid M Number: " + mNumber);
        System.out.println("Valid Menu Choice: " + menuChoice);
    }

    // Method to get a string that matches a regular expression pattern
    public static String getRegExString(Scanner scanner, String prompt, String regex) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
