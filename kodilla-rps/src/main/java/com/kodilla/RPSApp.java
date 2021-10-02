package com.kodilla;

public class RPSApp {

    public static void main(String[] args) {
        boolean end = false;

        do {
            Player player1 = new HumanPlayer(InputOutputController.getPlayerName());
            Player player2 = new ComputerPlayer();
            GameRules rules = new RPSRules();
            GameProcessor processor = new GameProcessor(player1, player2, rules, InputOutputController.getMaxPoints());
            InputOutputController.printControlsInformation();
            processor.play();
            end = InputOutputController.isGameOver();
        } while(!end);
    }
}
