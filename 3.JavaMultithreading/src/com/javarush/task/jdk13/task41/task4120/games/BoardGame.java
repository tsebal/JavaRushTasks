package com.javarush.task.jdk13.task41.task4120.games;

import java.util.Random;

public abstract class BoardGame {

    private int playersAmount;

    protected abstract void initialize();

    protected abstract void play();

    protected abstract void end();

    public final void start(int playersAmount) {
        setPlayersAmount(playersAmount);
        initialize();
        play();
        end();
        printWinner();
    }

    protected void printWinner() {
        System.out.println("Победил игрок № " + (new Random().nextInt(playersAmount) + 1));
    }

    public void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }
}
