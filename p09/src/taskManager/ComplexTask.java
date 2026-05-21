package taskManager;

public class ComplexTask implements Task {
	
	String title;
	int priority;
	int personDays;
	
	public ComplexTask (String title, int priority, int personDays) {
		this.title = title;
		this.priority = priority;
		this.personDays = personDays;
	}
	
	public String getTitle() {
		return title;
	}
	public int getPriority() {
		return priority;
	}
	
	public int getPersonDays() {
		return priority;
	}
}
