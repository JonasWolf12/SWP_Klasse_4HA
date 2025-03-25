package designPatternAbstractFactoryTask1;

public abstract class FurnitureStore {

	public static FurnitureStore getFactory(FurnitureType type) {
		if(type == FurnitureType.MODERN) {
			return new ModernFurniture();
		} else {
			return new AntiqueFurniture();
		}
	}
	
	public abstract Chair orderChair(); 
	
	public abstract Table orderTable(); 

	
}
