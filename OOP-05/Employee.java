public class Employee extends Person {

	int employeeId;

	public Employee(String name, int age, int employeeId) {
		super(name, age);
		this.employeeId = employeeId;
	}

	public void printDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("EmployeeId: " + this.employeeId);
	}

}