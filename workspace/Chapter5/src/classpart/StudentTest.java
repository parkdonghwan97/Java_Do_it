package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신" ; 
		studentLee.address = "서울시 서초구 서초동";
		studentLee.showStuInfo();
		
		
		

//		
		
		// Student객체 생성
		Student studentlee = new Student();
		studentlee.studentName ="이순신";
		studentlee.studentID = 100;
		studentlee.address = "서울시 영등포구 여의도동";
		
		Student studentkim = new Student();
		studentkim.studentName ="김유신";
		studentkim.studentID = 101;
		studentkim.address = "미국 산호세";
		
		studentkim.showStuInfo();
		studentlee.showStuInfo();

		
		System.out.println(studentlee);
	}

}
