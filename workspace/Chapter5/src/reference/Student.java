package reference;

public class Student {

	int studentID;
	String studentName;
	
//	int koreaScore;
//	int mathScore;
//	String koreaSubject;
//	String mathSubject;
//	
//	int engScore;
//	String engSubject;
	
	// ����
	Subject korea;
	Subject math;  


	public Student() {
		korea = new Subject("����")	;
		math = new Subject("����")	;
		
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subject("����");
		math = new Subject("����");
	}
	
	
	
	public void setKorea(int score) {
//		korea.setSubjectName(name);
		korea.setScore(score);
	
//		korea.subjectName=name;
	}
	public void setMath(int score) {
//		math.setSubjectName(name);
		math.setScore(score);
	
	}
	public void showStudentInfo() {
		int tot = korea.getScore() +math.getScore();
		System.out.println(studentName + "�л��� ���� : "+ tot);
	}
	
	
}
