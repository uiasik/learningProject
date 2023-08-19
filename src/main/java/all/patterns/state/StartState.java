package all.patterns.state;

public class StartState {
    public void start() {
        StateInfo stateInfo = new StateInfo();
        stateInfo.stateInfo();
        stateInfo.setState(new TwoState());
        stateInfo.stateInfo();
    }
}
