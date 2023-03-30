package co.istad.mvcapp.view;

import java.util.Scanner;

public class InputView {
    public static int getInputNumbers(Scanner input) {
        try {
            return Integer.parseInt(input.nextLine());
        } catch (Exception ex) {
            System.out.println("Allow number only");
        }
        return 0;
    }
    public static String getInputData(Scanner scanner){
        return scanner.nextLine();
    }
}
