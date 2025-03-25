package designPatternAbstractFactoryTask1;

public class Client {
public void main(final String[] args) {
	final FurnitureStore store = FurnitureStore.getFactory(FurnitureType.MODERN);
	final Chair chair = store.orderChair();
	final Table table = store.orderTable();
	
}
}
