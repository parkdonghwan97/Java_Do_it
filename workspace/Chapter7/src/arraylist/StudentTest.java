package arraylist;

public class StudentTest {
	public static void main(String[] args) {
		
		
		
		Student LEE = new Student(1001, "LEE");
		LEE.addSubject("����", 100);
		LEE.addSubject("����", 90);
		LEE.addSubject("����", 10);
		LEE.showStudentInfo();
		System.out.println("====================================================");
		Student KIM = new Student(1001, "KIM");
		KIM.addSubject("����", 100);
		KIM.addSubject("����", 90);
		KIM.addSubject("����", 80);
		
		KIM.showStudentInfo();
		
	}
}
