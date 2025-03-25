package onlineAuction;

public class AuctionObserver implements Bidder {

	private double money;

	@Override
	public void update(int money) {
		this.money = money;
	}
	
}
