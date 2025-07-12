package Evaluation;

public class Main {
	public static void main(String[] args) {
		try {
			Student s1 = new Student("Alice", 101, "CS", new int[] {85, 90, 88, 92, 88});
			Student s2 = new Student("Bob", 102, "CS", new int[] {95, 92, 90, 91, 92});
			Student s3 = new Student("Clara", 103, "CS", new int[] {65, 70, 60, 68, 64});
			
			Department csDept = new Department();
			csDept.addStudent(s1);
			csDept.addStudent(s2);
			csDept.addStudent(s3);
			
			System.out.println("------- All Students -------");
			csDept.displayAll();
			
			System.out.println("\nTopper: " + csDept.getTopper().getName() + "(Average: " + String.format("%.1f", csDept.getTopper().getAverage()) + ")");
			
			System.out.println();
			csDept.printSummary();
		}catch (InvalidMarksException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
