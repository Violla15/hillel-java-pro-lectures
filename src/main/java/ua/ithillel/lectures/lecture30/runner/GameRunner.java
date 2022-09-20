package ua.ithillel.lectures.lecture30.runner;

import lombok.Getter;
import lombok.Setter;
import ua.ithillel.lectures.lecture30.game.Game;

import java.util.Random;

public class GameRunner {

    @Setter
    private Game game;
    @Getter
    private boolean isRunning;
    private GamePad gamePad;

    public GameRunner() {
        gamePad = new GamePad();
    }

    public void run() {
        isRunning = true;
        runGameSimulation();
    }

    private void runGameSimulation() {
        Random random = new Random();
        int randomPressesCount = random.ints(4, 10)
                .findFirst()
                .orElse(1);

        for (int i = 0; i <= randomPressesCount; i++) {
            int randomButtonIndex = random.ints(0, GamePad.Button.values().length)
                    .findFirst()
                    .orElse(1);

            gamePad.pressButton(GamePad.Button.values()[randomButtonIndex], game);
        }
    }

    public void stop() {
        isRunning = false;
    }
}
