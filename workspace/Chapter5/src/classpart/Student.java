package classpart;

public class Student {

	
		
		int studentID;
		String studentName ;
		int grade ; 
		String address;
		
		
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
	}



