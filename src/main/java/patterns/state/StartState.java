package main.java.patterns.state;

import main.java.Start;

public class StartState implements Start {
    public void start() {
        StateInfo stateInfo = new StateInfo();
        stateInfo.stateInfo();
        stateInfo.setState(new TwoState());
        stateInfo.stateInfo();
    }
}
