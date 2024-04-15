package st10077892poepartone;

import java.util.Scanner;

public class ST10077892POEPARTONE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            int usernameLength = enteredUsername.length();
            boolean isUsernameValid = enteredUsername.contains("_") && usernameLength <= 5;

            if (isUsernameValid) {
                System.out.println("Username successfully captured");
            } else {
                System.out.println("Username not correctly formatted");
                continue; 
            }

            boolean isPasswordValid = enteredPassword.length() >= 8 &&
                    enteredPassword.matches(".*[A-Z].*") &&
                    enteredPassword.matches(".*[a-z].*") &&
                    enteredPassword.matches(".*\\d.*") &&
                    enteredPassword.matches(".*[@#$%^&+=!].*");

            if (isPasswordValid) {
                System.out.println("Password successfully captured");
            } else {
                System.out.println("Password not correctly formatted");
                continue; 
            }

            System.out.println("\n---Login---");
            System.out.print("Enter username to login: ");
            String loginUsername = scanner.nextLine();
            System.out.print("Enter password to login: ");
            String loginPassword = scanner.nextLine();

            if (loginUsername.equals(enteredUsername) && loginPassword.equals(enteredPassword)) {
                System.out.println("Welcome " + enteredUsername + ", it is great to see you again.");
                break; 
            } else {
                System.out.println("Username or password incorrect, please try again");
            }

            System.out.print("Do you want to try again? (yes/no): ");
            String tryAgain = scanner.nextLine();
            if (!tryAgain.equalsIgnoreCase("yes")) {
                break; 
            }
        }
        scanner.close(); 
    }
}
