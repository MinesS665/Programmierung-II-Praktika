package taskManager;

import java.util.ArrayList;

public class TaskPlan <T extends Task> {

	ArrayList<T> tasks = new ArrayList<>();
	
	int size = 0;
	
	public void add(T task) {
		size++;
		tasks.add(task);
	}
	
	public int size() {return size;}
	
	public T findByTitle(String name) {
		for(T task : tasks) {
			if (task.getTitle().equals(name)) return task;
		}
		return null;
	}
}
