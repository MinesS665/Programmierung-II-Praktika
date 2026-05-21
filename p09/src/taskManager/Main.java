package taskManager;

public class Main {
	
	public static void main(String [] args) {
		
		TaskPlan<Task> plan = new TaskPlan<>();
		
		plan.add(new SimpleTask("Login fixen", 3));
		plan.add(new SimpleTask("UI verbessern", 2));
		plan.add(new ComplexTask("Bug report schreiben", 1, 15));
		
		System.out.println("Es gibt " + plan.size() + " Aufgaben");
		
		Task found1 = plan.findByTitle("UI verbessern");
		
		System.out.println("Prio von UI verbessern: " + found1.getPriority());
		
		Task found2 = plan.findByTitle("Bug report schreiben");
		
		System.out.println("Prio von Bug report schreiben: " + found2.getPriority());
	}
}
