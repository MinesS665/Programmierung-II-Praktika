package taskManager;

public class SimpleTask implements Task {
	
	String title;
	int priority;
	
	public SimpleTask (String title, int priority) {
		this.title = title;
		this.priority = priority;
	}
	
	public String getTitle() {
		return title;
	}
	public int getPriority() {
		return priority;
	}
	
}
