package Functionality;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidate {

    public static int getValidInput() {

        Scanner scan = new Scanner(System.in);
        int input = -1;
        boolean validInput = false;

        while(!validInput) {
            try {
                input = scan.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice, try again...");
                scan.nextLine();
            }
        }
        return input;
    }

}