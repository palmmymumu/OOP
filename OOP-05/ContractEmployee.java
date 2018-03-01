public class ContractEmployee extends Employee {

	private int payment;

	public ContractEmployee(String name, int age, int employeeId, int payment) {
		super(name, age, employeeId);
		this.payment = payment;
	}

	public void printDetails() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("EmployeeId: " + this.employeeId);		
		System.out.println("Payment: " + this.payment);
	}

}