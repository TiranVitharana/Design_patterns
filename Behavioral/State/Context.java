public class Context {
    private State state;
    
    public Context() {
        state = new Charging();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void press() {
        state.pressButton(this);
    }

    
}
