package registrationloginapp;

import java.util.Scanner;

public class RegistrationLoginApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== USER REGISTRATION =====");

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        System.out.print("Enter Cell Phone Number: ");
        String cellPhoneNumber = input.nextLine();

        Login login = new Login(
                username,
                password,
                cellPhoneNumber,
                firstName,
                lastName);

        System.out.println();
        System.out.println(login.registerUser());

        System.out.println("\n===== LOGIN =====");

        System.out.print("Enter Username: ");
        String enteredUsername = input.nextLine();

        System.out.print("Enter Password: ");
        String enteredPassword = input.nextLine();

        boolean loginStatus =
                login.loginUser(
                        enteredUsername,
                        enteredPassword);

        System.out.println(
                login.returnLoginStatus(loginStatus));
    }
}