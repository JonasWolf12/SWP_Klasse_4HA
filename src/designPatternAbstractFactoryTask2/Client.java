package designPatternAbstractFactoryTask2;

public class Client {

	public static void main(String[] args) {
		final AbstractFactory factory = AbstractFactory.getFactory(CharacterType.FANTASY);
		final Warrior warrior =factory.createWarrior();
		
		}
 
}
