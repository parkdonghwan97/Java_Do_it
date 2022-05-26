package arraylist;

public class StudentTest {
	public static void main(String[] args) {
		
		
		
		Student LEE = new Student(1001, "LEE");
		LEE.addSubject("국어", 100);
		LEE.addSubject("수학", 90);
		LEE.addSubject("영어", 10);
		LEE.showStudentInfo();
		System.out.println("====================================================");
		Student KIM = new Student(1001, "KIM");
		KIM.addSubject("국어", 100);
		KIM.addSubject("수학", 90);
		KIM.addSubject("영어", 80);
		
		KIM.showStudentInfo();
		
	}
}
