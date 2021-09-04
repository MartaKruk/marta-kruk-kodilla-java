package com.kodilla;

import java.util.Random;

public class ComputerPlayer extends Player{

    private Random random = new Random();

    public ComputerPlayer() {
        super("Computer");
    }

    @Override
    public int getMove() {

        return random.nextInt(3) + 1;
    }
}
