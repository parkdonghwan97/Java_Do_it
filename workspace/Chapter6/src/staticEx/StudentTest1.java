package staticEx;

public class StudentTest1 {
	public static void main(String[] args) {
		
		
		
		System.out.println(Student.serialNum);
		
		
		 //��ü �����Ǹ� static ���� serial�� 1����, studentID �� serial��ȣ���� ��
		Student LEE = new Student();
		
		System.out.println(LEE.studentID);
//		System.out.println(LEE.serialNum);
		System.out.println(Student.serialNum);
//		LEE.serialNum++;
		
		Student KIM = new Student();
		
		System.out.println(KIM.studentID);
		
		//  static������ �ν��Ͻ� ������ ������� �޸𸮿� ����.  
		// ���������� ���� �ʰ� Ŭ���� �̸����� �ٷ� ������.
//		System.out.println(KIM.serialNum); 
		System.out.println(Student.serialNum);  //static ������ ���� Class �̸����� ����
		
		
		System.out.println( Student.getSerialNum2()    );
		
		
		
		
		
	}

}
