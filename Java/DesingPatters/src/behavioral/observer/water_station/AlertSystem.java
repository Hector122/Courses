package behavioral.observer.water_station;

public class AlertSystem implements Observer, DisplayElement {
    private WeatherSubject weatherStation;
    private float temperature;
    private float windSpeed;
    private float pressure;

    public AlertSystem(WeatherSubject weatherStation){
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float windSpeed, float pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + windSpeed + "% windSpeed " + "Pressure " + pressure );
    }
}
