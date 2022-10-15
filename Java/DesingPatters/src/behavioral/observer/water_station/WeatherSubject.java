package behavioral.observer.water_station;

public interface WeatherSubject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserves();
}
