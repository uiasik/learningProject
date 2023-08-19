package all.patterns.state;

public class StateInfo {
    private State state = new OneState();

    public void setState(State state) {
        this.state = state;
    }

    public void stateInfo() {
        state.stateInfo();
    }
}
