public class PermanentEmployee extends Employee {

	private int salary;

	public PermanentEmployee(String name, int age, int employeeId, int salary) {
		super(name, age, employeeId);
		this.salary = salary;
	}

	public void printDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("EmployeeId: " + this.employeeId);		
		System.out.println("Salary: " + this.salary);
	}

}