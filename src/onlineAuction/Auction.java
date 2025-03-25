package onlineAuction;

import java.util.ArrayList;
import java.util.List;

public class Auction {



		    private List<AuctionObserver> observers = new ArrayList<>();
		    private int money;

		    public void addObserver(AuctionObserver observer) {
		        observers.add(observer);
		    }

		    public void removeObserver(AuctionObserver observer) {
		        observers.remove(observer);
		    }
		    
		    
		    private void notifyObservers() {
		        for (AuctionObserver observer : observers) {
		            observer.update(money);
		        }
		    }
		    
		    public void setMoney(int money) {
		        this.money = money;
		        notifyObservers();
		    }
		



}
