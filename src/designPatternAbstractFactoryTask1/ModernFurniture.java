package designPatternAbstractFactoryTask1;

public class ModernFurniture extends FurnitureStore {

	
	@Override
	public Chair orderChair() {
		// TODO Auto-generated method stub
		return new ModernChair();
	}

	@Override
	public Table orderTable() {
		// TODO Auto-generated method stub
		return new ModernTable() ;
	}

}
