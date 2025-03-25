package designPatternAbstractFactoryTask1;

public class AntiqueFurniture extends FurnitureStore {

	@Override
	public Chair orderChair() {
		// TODO Auto-generated method stub
		return new AntiqueChair();
	}

	@Override
	public Table orderTable() {
		// TODO Auto-generated method stub
		return new AntiqueTable();
	}

}
