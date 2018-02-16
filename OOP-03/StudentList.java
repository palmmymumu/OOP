import java.util.ArrayList;
public class StudentList {

	private ArrayList<Student> stList;

	public StudentList() {
		stList = new ArrayList<Student>();
	}

	public void addStudent(Student s) {
		stList.add(s);
	}

	public void removeStudentBystCode(String stCode) {
		for (int i = 0; i < stList.size(); i++) {
			if (stList.get(i).getCode() == stCode)
				stList.remove(i);
		}
	}

	public void showAllStudentInfo() {
		for (int i = 0; i < stList.size(); i++) {
			System.out.println(stList.get(i));
		}
	}

	public Student searchStudentBystCode(String stCode) {
		for (int i = 0; i < stList.size(); i++) {
			if (stList.get(i).getCode() == stCode)
				return stList.get(i);
		}
		return new Student();
	}

	public int getNumberOfStudent() {
		return stList.size();
	}

}