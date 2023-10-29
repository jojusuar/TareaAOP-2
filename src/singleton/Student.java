package singleton;

public class Student {
	private String name;
	private int score;
	
	public Student(String name) {
		this.name = name;
		this.score = 0;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return name=": "+score+"/10";
	}
	
	

}
