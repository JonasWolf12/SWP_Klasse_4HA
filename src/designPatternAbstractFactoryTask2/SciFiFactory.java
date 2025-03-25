package designPatternAbstractFactoryTask2;

public class SciFiFactory extends AbstractFactory {

	@Override
	public Warrior createWarrior() {
		// TODO Auto-generated method stub
		return new SciFiWarrior();
	}

	@Override
	public Wizzard createWizzard() {
		// TODO Auto-generated method stub
		return new SciFiWizzard();
	}

}
