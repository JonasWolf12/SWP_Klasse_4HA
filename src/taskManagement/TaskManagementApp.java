package taskManagement;

public class TaskManagementApp {

private Task Tasklist;
	
	public TaskManagementApp(Task Tasklist) {
		this.Tasklist = Tasklist;
	}
	
	public void display() {
		this.Tasklist.display();
		System.out.println();
	}
}
