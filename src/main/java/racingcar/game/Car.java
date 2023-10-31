package racingcar.game;

import static racingcar.controller.constants.IntegerConstants.*;

public class Car {
    private final String name;
    private Integer score;

    public Car(String name){
        this.name = name;
        this.score = STARTING_POINT.getValue();
    }

    public void moveForward(){
        this.score += ONE_STEP.getValue();
    }

    public String getCarName(){
        // TODO: getter 사용 지양
        return this.name;
    }

    public Integer getScore(){
        // TODO: getter 사용 지양
        return this.score;
    }
}
