package applications.calculator;

public class PowerImpl implements Power {
    private boolean on;

    PowerImpl() {
        this.on = false;
    }

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
