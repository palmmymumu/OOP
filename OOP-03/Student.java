public class Student {
		private String stCode;
		private String name;
		private double gpa;

		public Student() { }

		public Student(String stCode, String name) {
			this.stCode = stCode;
			this.name = name;
		}

		public Student(String stCode, String name, double gpa) {
			this.stCode = stCode;
			this.name = name;
			this.gpa = gpa;
		}

		public String getCode() {
			return this.stCode;
		}

		public String getName() {
			return this.name;
		}

		public double getGPA() {
			return this.gpa;
		}

		public void setGPA(double gpa) {
			this.gpa = gpa;
		}

		public String toString() {
			String s = stCode + " " + name + " " + gpa;
			return s;
		}

}