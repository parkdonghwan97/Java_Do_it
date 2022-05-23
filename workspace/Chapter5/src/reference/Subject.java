package reference;

public class Subject {
	
	String subjectName;
	int score;
	
	
	public Subject(String name) {
		subjectName = name;
	}
	
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
//	public void setSubjectName(String name) {
//		subjectName = name;
//	}
	// 이클립스 - 우클릭 - 소스 - Generate Getters and Setters로 쉽게 생성 가능

}
