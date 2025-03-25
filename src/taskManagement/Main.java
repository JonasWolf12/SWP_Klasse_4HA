package taskManagement;

public class Main {

	public static void main(String[] args) {

		Task t1 = new SimpleTask("eins");
		Task t2 = new SimpleTask("zwei");
		Task t3 = new SimpleTask("drei");
		
		Task list1 = new TaskList("Liste1");
		list1.addTask(t1);
		list1.addTask(t2);
		
		Task list2 = new TaskList("Liste2");
		list1.addTask(t2);
		list1.addTask(t3);
		
		list1.display();
		list2.display();
	}

}
