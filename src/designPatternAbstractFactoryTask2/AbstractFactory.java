package designPatternAbstractFactoryTask2;

public abstract class AbstractFactory {

	public static AbstractFactory getFactory(CharacterType type) {
		if(type == CharacterType.FANTASY) {
			return new FantasyFactory();
		} else {
			return new SciFiFactory();
		}
	}
	
	public abstract Warrior createWarrior();
	
	public abstract Wizzard createWizzard();

	
	
	
}
