package behavioral.observer.water_station;

public interface Observer {
    void update(float temperature, float windSpeed, float pressure);
}
