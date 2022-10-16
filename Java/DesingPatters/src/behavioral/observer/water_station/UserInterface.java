package behavioral.observer.water_station;

public class UserInterface implements Observer {
    private  WeatherStation weatherStation;


    public UserInterface(WeatherStation weatherStation){
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float windSpeed, float pressure) {
        System.out.println("Show user interface: " );
    }
}
