package applications.calculator;

abstract class Calculator implements IBasicFunctionality {
    private boolean on;

    Calculator() {
        this.on = false;
    }

    public boolean isOn(){
        return on;
    }

    public void turnOn(){
        if (!on){
            on = true;
        }
    }

    public void turnOff(){
        if(on){
            on = false;
        }
    }

    public abstract String getResult();
}
