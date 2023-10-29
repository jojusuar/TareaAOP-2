package singleton_AOP;
import java.util.ArrayList;
import java.util.List;

public class GradesRepository {
	private List<String> grades;
	
	public GradesRepository() {
		grades = new ArrayList<>();
	}
	
	public List<String> getGrades() {
		return grades;
	}
	
	public void add(String grade) {
		grades.add(grade);
	}
	
	public void remove(int index) {
		grades.remove(index);
	}

 
}
