package designPatternSingleton;

public class Databank {
	
	private Databank() {}
	
	public static class DatabankHolder {
		private final static Databank INSTANCE = new Databank();
	}

	public static Databank getInstance() {
		return DatabankHolder.INSTANCE;
	}
	
	public void dataBankMessage(String message) {
		System.out.println("[Databank:] " + message);
	}
}
