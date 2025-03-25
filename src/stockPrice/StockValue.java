package stockPrice;

import java.util.ArrayList;
import java.util.List;

public class StockValue {

	    private List<StockValueObserver> observers = new ArrayList<>();
	    private int temperature;

	    public void addObserver(StockValueObserver observer) {
	        observers.add(observer);
	    }

	    public void removeObserver(StockValueObserver observer) {
	        observers.remove(observer);
	    }
	    
	    
	    private void notifyObservers() {
	        for (StockValueObserver observer : observers) {
	            observer.update(temperature);
	        }
	    }
	    
	    public void setTemperature(int temperature) {
	        this.temperature = temperature;
	        notifyObservers();
	    }
	}

