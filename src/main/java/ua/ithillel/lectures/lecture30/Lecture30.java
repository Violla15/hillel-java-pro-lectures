package ua.ithillel.lectures.lecture30;

import ua.ithillel.lectures.lecture30.game.Game;
import ua.ithillel.lectures.lecture30.game.TetrisGame;
import ua.ithillel.lectures.lecture30.runner.GameRunner;

public class Lecture30 {

    public static void main(String[] args) {
        GameRunner gameRunner = new GameRunner();
        Game tetrisGame = new TetrisGame();
        gameRunner.setGame(tetrisGame);
        gameRunner.run();
    }
}
