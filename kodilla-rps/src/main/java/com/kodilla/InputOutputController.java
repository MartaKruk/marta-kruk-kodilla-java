package com.kodilla;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputOutputController {

    private static final Scanner scanner = new Scanner(System.in);
    public static final Pattern PATTERN = Pattern.compile("^\\d+$");
    private static final String X = "x";
    private static final String N = "n";

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

    public static boolean ifRestart() {
        do {
            System.out.println("Are you sure you want to restart the game? (y/n)");
            String answer = scanner.nextLine();
            if (Objects.equals(answer, "y") || Objects.equals(answer, "n")) {
                if (Objects.equals(answer, "y")) {
                    return false;
                } else {
                    return InputOutputController.isGameOver();
                }
            }
            System.out.println("Please try again!");
        } while (true);
    }

    public static boolean ifExit() {
        do {
            System.out.println("Are you sure you want to exit the game? (y/n)");
            String answer = scanner.nextLine();
            if (Objects.equals(answer, "y") || Objects.equals(answer, "n")) {
                if (Objects.equals(answer, "y")) {
                    return true;
                } else {
                    return InputOutputController.isGameOver();
                }
            }
            System.out.println("Please try again!");
        } while (true);
    }

    //zmienic na switch
    public static boolean isGameOver() {
        do {
            System.out.println("Do you want to end the game (x) or play again (n)?");
            String answer = scanner.nextLine();
            if (Objects.equals(answer, "n") || Objects.equals(answer, "x")) {
                if (Objects.equals(answer, "n")) {
                    System.out.println("Are you sure you want to restart the game? (y/n)");
                        String yesOrNo = scanner.nextLine();
                        if (Objects.equals(yesOrNo, "y") || Objects.equals(yesOrNo, "n")) {
                            if (Objects.equals(yesOrNo, "y")) {
                                return false;
                            } else {
                                return InputOutputController.isGameOver();
                            }
                        }
                } else {
                    System.out.println("Are you sure you want to exit the game? (y/n)");
                        answer = scanner.nextLine();
                        if (Objects.equals(answer, "y") || Objects.equals(answer, "n")) {
                            if (Objects.equals(answer, "y")) {
                                return true;
                            } else {
                                return InputOutputController.isGameOver();
                            }
                        }
                }
            }
            System.out.println("Please try again!");
        } while (true);
    }

    static boolean isNaturalNumber(CharSequence input) {
        return input != null && PATTERN.matcher(input).matches();
    }
}
