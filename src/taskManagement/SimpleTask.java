package taskManagement;

public class SimpleTask extends Task {

	public SimpleTask(String string) {
		super(string);
	}

	@Override
	public void display() {
		System.out.println(getTitle());
	}

	
}
