package taskManagement;

import java.util.ArrayList;

public class TaskList extends Task{

	private ArrayList<Task> tasks = new ArrayList<>();
	
	public TaskList(String string) {
		super(string);
	}


	@Override
	public void display() {
		for(Task task : tasks) {
			task.display();
		}
	}

	
	public void addTask(Task task) {
		this.tasks.add(task);
	}
	
	
	public void removeTask(Task task) {
		this.tasks.remove(task);	
	}
}
