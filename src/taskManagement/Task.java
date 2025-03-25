package taskManagement;

public abstract class Task {

	private String title;

	public Task(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public abstract void display();
	
	
	public void addTask(Task t) {
		//Leermethode für die Leaf- Nodes
	}
	
	
	public void removeTask(Task t) {
		//Leermethode für die Leaf- Nodes
	}
	
}
