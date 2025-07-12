package Evaluation;

public class Student {
	
	private String name;
	private int rollNumber;
	private String course;
	private int[] marks;
	
	public Student(String name, int rollNumber, String course, int[] marks)throws InvalidMarksException{
		this.name = name;
		this.rollNumber = rollNumber;
		this.course = course;
		setMarks(marks);
	}

	private void setMarks(int[] marks) throws InvalidMarksException {
		// TODO Auto-generated method stub
		for(int mark : marks) {
			if(mark < 0 || mark > 100) {
				throw new InvalidMarksException("Invalid mark found: " + mark + ". Marks must be between 0 and 100.");
			}
		}
		this.marks = marks;
	}
	
	public double calculateAverage() {
		int sum = 0;
		for(int mark : marks) {
			sum += mark;
		}
		return sum / 5.0;
	}
	
	public String getGrade() {
		double avg = calculateAverage();
		if(avg >= 90) return "A";
		else if (avg >= 80) return "B";
		else if (avg >= 70) return "C";
		else if (avg >= 60) return "D";
		else return "F";
	}
	
	public String toString() {
		return "Student: " + name + " |\n" +
				"Roll No: " + rollNumber + " |\n" +
				"Average: " + String.format("%.1f", calculateAverage()) + "|\n" +
				"Grade: " + getGrade();
	}
	public double getAverage() {
		return calculateAverage();
	}
	
	public String getName() {
		return name;
	}

}
