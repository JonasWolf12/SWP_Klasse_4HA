package weatherStation;
 
import java.util.ArrayList;
import java.util.List;
 
 
public class WeatherStation {
    private List<WeatherObserver> observers = new ArrayList<>();
    private int weather;
 
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }
 
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }
    
    
    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(weather);
        }
    }
    
    public void setTemperature(int weather) {
        this.weather = weather;
        notifyObservers();
    }
}
