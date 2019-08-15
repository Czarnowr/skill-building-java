package applications.calculator;

public class BasicFunctionalityImpl implements BasicFunctionality{
    private boolean on;

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        if (!on) {
            on = true;
        }
    }

    public void turnOff() {
        if (on) {
            on = false;
        }
    }
}
