public class Date {
    private String time;
    private Weather weather;

    public Date(String time){
        this.time=time;
    }


    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
