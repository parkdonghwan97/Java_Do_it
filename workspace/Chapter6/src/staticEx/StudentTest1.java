package staticEx;

public class StudentTest1 {
	public static void main(String[] args) {
		
		
		
		System.out.println(Student.serialNum);
		
		
		 //객체 생성되면 static 변수 serial은 1증가, studentID 에 serial번호값이 들어감
		Student LEE = new Student();
		
		System.out.println(LEE.studentID);
//		System.out.println(LEE.serialNum);
		System.out.println(Student.serialNum);
//		LEE.serialNum++;
		
		Student KIM = new Student();
		
		System.out.println(KIM.studentID);
		
		//  static변수는 인스턴스 생성과 관계없이 메모리에 잡힘.  
		// 참조변수로 쓰지 않고 클래스 이름으로 바로 참조함.
//		System.out.println(KIM.serialNum); 
		System.out.println(Student.serialNum);  //static 변수는 사용시 Class 이름으로 생성
		
		
		System.out.println( Student.getSerialNum2()    );
		
		
		
		
		
	}

}
