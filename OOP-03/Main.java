class Main {

	public static void main(String[] args) {

		StudentList stList = new StudentList();

		Student s1 = new Student("5835512030", "Palm", 3.96);
		stList.addStudent(s1);

		Student s2 = new Student("5835512012", "Biw", 2.96);
		stList.addStudent(s2);

		Student s3 = new Student("5835512092", "Ton", 1.96);
		stList.addStudent(s3);

		System.out.println("showAllStudentInfo");
		stList.showAllStudentInfo();
		System.out.println("===================================");

		System.out.println("searchStudentBystCode: 5835512030");
		System.out.println(stList.searchStudentBystCode("5835512030").toString());
		System.out.println("===================================");

		stList.removeStudentBystCode("5835512030");

		System.out.println("removeStudentBystCode: 5835512030");
		stList.showAllStudentInfo();
		System.out.println("===================================");

		System.out.println("getNumberOfStudent: " + stList.getNumberOfStudent());
		System.out.println("===================================");



	}

}