package tempratureSensorObserver;

import java.util.ArrayList;
import java.util.List;

class TemperatureSensor {
    private List<TemperatureObserver> observers = new ArrayList<>();
    private int temperature;

    public void addObserver(TemperatureObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TemperatureObserver observer) {
        observers.remove(observer);
    }
    
    
    private void notifyObservers() {
        for (TemperatureObserver observer : observers) {
            observer.update(temperature);
        }
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}