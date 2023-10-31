package racingcar.controller;

import racingcar.game.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import static racingcar.controller.constants.GlobalConstants.*;

public class Game {
    private Integer round;
    private Cars cars;

    public void run(){
        OutputView.startGame();
        cars = new Cars(InputView.readCarNames());
        askGameRounds();
        OutputView.startGameResult();
        mainLogic();
        result();
    }

    private void askGameRounds(){
        OutputView.askGameRounds();
        round = Parser.parsingInteger(InputView.readLine());
    }

    private void mainLogic(){
        for(int count = STARTING_POINT.getValue(); count < round; count++){
            cars.roundRace();
            OutputView.theEndOfRound();
        }
    }

    private void result(){
        cars.getWinners();
    }
}
