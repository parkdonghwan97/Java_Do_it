package classpart;

public class Student {

	
		
		int studentID;
		String studentName ;
		int grade ; 
		String address;
		
		
		// Ŭ������ �����ڰ� �ϳ��� ���� ��� �ڹ� �����Ϸ���  ����Ʈ �����ڸ� �־���   Ư¡: �Ű����� ���� ���� �ڵ� ����
		// �����ڰ� �ϳ��� �ִ°�� ����Ʈ ������ �������� ����
		public Student() {}   
		
		public Student(int id, String name) {	// �޼��� �����ε�
			studentID = id;
			studentName=name;
		}
		
					
		
		public void showStuInfo() {
			System.out.println(studentName + "," + address);
		}

//		public static void main(String[] args) {
//			Student studentLee = new Student();
//			studentLee.studentName = "�̼���" ; 
//			studentLee.address = "����� ���ʱ� ���ʵ�";
//			studentLee.showStuInfo();
//			
//		}
		
		//�Ű����� X ��ȯ�� O  �л� �̸� ��ȯ �޼���
		public String getStuName() {
			return studentName ;
		}
		
		// �Ű����� O ��ȯ�� X   �л��̸� �ٲٴ� �޼���
		public void setStuName(String name) {
			studentName = name;
		}
//		public static void main(String[] args) {
//			
//			// Student��ü ����
//			Student studentlee = new Student();
//			studentlee.studentName ="�̼���";
//			studentlee.studentID = 100;
//			studentlee.address = "����� �������� ���ǵ���";
//			
//			Student studentkim = new Student();
//			studentkim.studentName ="������";
//			studentkim.studentID = 101;
//			studentkim.address = "�̱� ��ȣ��";
//			
//			studentkim.showStuInfo();
//			studentlee.showStuInfo();
//			
//			
//		}
	}



