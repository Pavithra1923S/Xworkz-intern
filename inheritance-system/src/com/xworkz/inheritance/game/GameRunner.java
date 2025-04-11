package com.xworkz.inheritance.game;

public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
        game.endGame();

        SquidGame squid = new SquidGame();
        squid.startGame();
        squid.endGame();

        Game game1 = new SquidGame();
        System.out.println(game1);

        SquidGame squidGame =(SquidGame) game1;
        System.out.println(squidGame);
    }
}
