package behavioral.observer.water_station;

public class Logger implements Observer {
    private  WeatherStation weatherStation;

    public Logger(WeatherStation weatherStation){
        weatherStation.registerObserver(this);
    }


    @Override
    public void update(float temperature, float windSpeed, float pressure) {
        System.out.println("Logger Data: " );

    }
}
