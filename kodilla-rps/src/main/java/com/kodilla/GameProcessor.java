package com.kodilla;

public class GameProcessor {

    private Player player1;
    private Player player2;
    private GameRules rules;
    private int maxPoints;

    public GameProcessor(Player player1, Player player2, GameRules rules, int maxPoints) {
        this.player1 = player1;
        this.player2 = player2;
        this.rules = rules;
        this.maxPoints = maxPoints;
    }

    public void play() {
        while(player1.getPoints()<maxPoints || player2.getPoints()<maxPoints) {
            int player1Move = player1.getMove();
            int player2Move = player2.getMove();
            int whoWon = rules.whoWon(player1Move, player2Move);
            if (whoWon == 1) {
                player1.addPoint();
            } else if (whoWon == 2) {
                player2.addPoint();
            } else {
                //to do: remis
            }
        }
    }
}
