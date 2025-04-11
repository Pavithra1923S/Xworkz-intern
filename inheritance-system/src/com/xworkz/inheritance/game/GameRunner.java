package com.xworkz.inheritance.game;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
        game.endGame();

        SquidGame squid = new SquidGame();
        squid.startGame();
        squid.endGame();
    }
}
