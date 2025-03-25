package designPatternAbstractFactoryTask2;

public class FantasyFactory extends AbstractFactory {

	@Override
	public Warrior createWarrior() {
		// TODO Auto-generated method stub
		return new FantasyWarrior();
	}

	@Override
	public Wizzard createWizzard() {
		// TODO Auto-generated method stub
		return new FantasyWizzard();
	}

}
