package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���" ; 
		studentLee.address = "����� ���ʱ� ���ʵ�";
		studentLee.showStuInfo();
		
		
		

//		
		
		// Student��ü ����
		Student studentlee = new Student();
		studentlee.studentName ="�̼���";
		studentlee.studentID = 100;
		studentlee.address = "����� �������� ���ǵ���";
		
		Student studentkim = new Student();
		studentkim.studentName ="������";
		studentkim.studentID = 101;
		studentkim.address = "�̱� ��ȣ��";
		
		studentkim.showStuInfo();
		studentlee.showStuInfo();

		
		System.out.println(studentlee);
	}

}
