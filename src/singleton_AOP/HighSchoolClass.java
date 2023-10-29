package singleton_AOP;
import java.util.LinkedList;
import java.util.List;

public class HighSchoolClass {
	private int number;
	private List<Student> students;
	
	public HighSchoolClass(int number) {
		this.number = number;
		this.students = new LinkedList<>();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void uploadGrades() {
		for(Student s: students) {
			GradesRepository.getInstance().add(s.toString());
		}
		
	}

}
