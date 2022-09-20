package ua.ithillel.lectures.lecture30.runner;

import ua.ithillel.lectures.lecture30.game.Game;

public class GamePad {

    public Button pressButton(Button button, Game game) {
        switch (button) {
            case UP -> game.up();
            case DOWN -> game.down();
            case LEFT -> game.left();
            case RIGHT -> game.right();
        }
        return button;
    }

    public enum Button {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
