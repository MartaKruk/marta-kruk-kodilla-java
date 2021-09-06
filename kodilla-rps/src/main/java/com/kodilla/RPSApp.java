package com.kodilla;

import java.util.Scanner;

public class RPSApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameRules rules = new RPSRules();

        System.out.println("Enter name: ");
        Player player1 = new HumanPlayer(scanner.nextLine());
        Player player2 = new ComputerPlayer();

        System.out.println("Enter number of points needed to win: ");
        GameProcessor processor = new GameProcessor(player1, player2, rules, scanner.nextInt());

        System.out.println("Hello " + player1.getName() + "!" +
                "\nGoal of the game: get " + processor.getMaxPoints() + " points." +
                "\nGame controls: \n1 - stone \n2 - paper \n3 - scissors \nx - end game \nn - play again");

    }
}
