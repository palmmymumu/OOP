public class Teacher extends Person {

	String faculty;

	public Teacher(String name, int age, String faculty) {
		super(name, age);
		this.faculty = faculty;
	}

	public void printDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("faculty: " + this.faculty);
	}

}