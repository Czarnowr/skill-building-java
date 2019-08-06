package applications.calculator;

abstract class Calculator implements IBasicFunctionality, ICalculations {
    private boolean on;

    Calculator() {
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

    public abstract String getResult();

    public abstract String add(double number);

    public abstract String subtract(double number);
}
