package onlineAuction;

public class AuctionTest {

	public static void main(String[] args) {
		
		Auction a = new Auction();
		
		AuctionObserver observer = new AuctionObserver();
		
		a.addObserver(observer);
		a.setMoney(4);
		

	}

}
