package com.kodilla;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputOutputController {

    private static final Scanner scanner = new Scanner(System.in);
    public static final Pattern PATTERN = Pattern.compile("^\\d+$");
    private static final String X = "x";
    private static final String N = "n";
    private static final String Y = "y";

    public static String getPlayerName() {
        System.out.println("Hello! Please enter your name: ");
            return scanner.nextLine();
    }

    public static int getMaxPoints() {
        System.out.println("Enter number of points needed to win: ");
        do {
            String value = scanner.nextLine();
            boolean isNumber = isNaturalNumber(value);
            if (isNumber) {
                int number = Integer.parseInt(value);
                if (number > 0 && number < 10) {
                    return number;
                }
            }
            System.out.println("Wrong number. Please enter your number again!");
        } while (true);
    }

    public static void printControlsInformation() {
        System.out.println("Game controls:\n1 - stone\n2 - paper\n3 - scissors\nx - end game\nn - play again");
    }

    public static int getPlayerMove() {
        System.out.println("Please enter your move: ");
        do {
            String value = scanner.nextLine();
            boolean isNumber = isNaturalNumber(value);
            if (isNumber) {
                int number = Integer.parseInt(value);
                if (number > 0 && number < 4) {
                    return number;
                }
            }
            System.out.println("Please enter your move again!");
        } while (true);
    }

    public static boolean isGameOver() {
        do {
            System.out.println("Do you want to end the game (x) or play again (n)?");
            String answer = scanner.nextLine();
            switch (answer) {
                case N:
                    System.out.println("Are you sure you want to restart the game? (y/n)");
                    answer = scanner.nextLine();
                    switch (answer) {
                        case Y:
                            return false;
                        case N:
                            return InputOutputController.isGameOver();
                    }
                case X:
                    System.out.println("Are you sure you want to exit the game? (y/n)");
                    answer = scanner.nextLine();
                    switch (answer) {
                        case Y:
                            return true;
                        case N:
                            return InputOutputController.isGameOver();
                    }
            }
            System.out.println("Please try again!");
        } while (true);
    }

    static boolean isNaturalNumber(CharSequence input) {
        return input != null && PATTERN.matcher(input).matches();
    }
}
