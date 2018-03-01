public class Student extends Person {

	private String major;
	private double gpa;

	public Student(String name, int age, String major, double gpa) {
		super(name, age);
		this.major = major;
		this.gpa = gpa;
	}

	public void printDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Major: " + this.major);
		System.out.println("Gpa: " + this.gpa);
	}

}