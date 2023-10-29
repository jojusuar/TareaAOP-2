package singleton_OOP;
import java.util.ArrayList;
import java.util.List;

public class GradesRepository {
	private static volatile GradesRepository self = null;
	private List<String> grades;
	
	private GradesRepository() {
		grades = new ArrayList<>();
	}
	
	
	public List<String> getGrades() {
		return grades;
	}


	public static GradesRepository getInstance() {
		if(self==null) {
			synchronized(GradesRepository.class){
				if(self==null) {
					self = new GradesRepository();
				}
			}
		}
		return self;
	}
	
	public void add(String grade) {
		grades.add(grade);
	}
	
	public void remove(int index) {
		grades.remove(index);
	}

 
}
