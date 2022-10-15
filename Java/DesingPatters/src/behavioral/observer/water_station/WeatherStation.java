package behavioral.observer.water_station;

import java.util.ArrayList;

public class WeatherStation implements WeatherSubject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float windSpeed;
    private float pressure;


    public WeatherStation(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0) observers.remove(observer);
    }

    @Override
    public void notifyObserves() {
        for(Observer observer : observers){
            observer.update(temperature, windSpeed, pressure);
        }
    }

    public void setMeasurements(float temperature, float windSpeed, float pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;

        notifyObserves();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getWindSpeed() {
        return windSpeed;
    }
    public float getPressure() {
        return pressure;
    }
}
