public class Weather {
    private int temperature;
    private boolean israin;

    public Weather(int temperature,boolean israin ){
        this.temperature=temperature;
        this.israin=israin;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isIsrain() {
        return israin;
    }

    public void setIsrain(boolean israin) {
        this.israin = israin;
    }
}

