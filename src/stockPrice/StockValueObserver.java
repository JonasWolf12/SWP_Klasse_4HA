package stockPrice;

public class StockValueObserver implements Broker{

	private double value;

	@Override
	public void update(int value) {
		this.value = value;
	}
}
