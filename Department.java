package Evaluation;

import java.util.ArrayList;
import java.util.HashMap;

public class Department implements Printable{
	
	private ArrayList<Student>students;
	
	public Department() {
		students =new ArrayList<>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public Student getTopper() {
		if(students.isEmpty())
		return null;
		
		Student topper = students.get(0);
		for(Student s : students ) {
			if(s.getAverage() > topper.getAverage()) {
				topper = s;
			}
		}
		return topper;
	}
	
	public void displayAll() {
		for(Student s : students) {
			System.out.println("------------------------------");
			System.out.println(s.toString());
		}
	}

	@Override
	public void printSummary() {
		// TODO Auto-generated method stub
		System.out.println("Department Summary -----");
		System.out.println("total Students: " + students.size());
		
		HashMap<String, Integer> gradeCount = new HashMap<>();
		for(Student s : students) {
			String grade = s.getGrade();
			gradeCount.put(grade, gradeCount.getOrDefault(grade, 0) + 1);
		}
		
		for(String grade : gradeCount.keySet()) {
			System.out.println("Grade " + grade + ": " + gradeCount.get(grade));
		}
		
	}
	

}
