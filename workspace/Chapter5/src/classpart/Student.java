package classpart;

public class Student {

	
		
		int studentID;
		String studentName ;
		int grade ; 
		String address;
		
		
		// 클래스가 생성자가 하나도 없는 경우 자바 컴파일러가  디폴트 생성자를 넣어줌   특징: 매개변수 없음 구현 코드 없음
		// 생성자가 하나라도 있는경우 디폴트 생성자 생성하지 않음
		public Student() {}   
		
		public Student(int id, String name) {	// 메서드 오버로딩
			studentID = id;
			studentName=name;
		}
		
					
		
		public void showStuInfo() {
			System.out.println(studentName + "," + address);
		}

//		public static void main(String[] args) {
//			Student studentLee = new Student();
//			studentLee.studentName = "이순신" ; 
//			studentLee.address = "서울시 서초구 서초동";
//			studentLee.showStuInfo();
//			
//		}
		
		//매개변수 X 반환형 O  학생 이름 반환 메서드
		public String getStuName() {
			return studentName ;
		}
		
		// 매개변수 O 반환형 X   학생이름 바꾸는 메서드
		public void setStuName(String name) {
			studentName = name;
		}
//		public static void main(String[] args) {
//			
//			// Student객체 생성
//			Student studentlee = new Student();
//			studentlee.studentName ="이순신";
//			studentlee.studentID = 100;
//			studentlee.address = "서울시 영등포구 여의도동";
//			
//			Student studentkim = new Student();
//			studentkim.studentName ="김유신";
//			studentkim.studentID = 101;
//			studentkim.address = "미국 산호세";
//			
//			studentkim.showStuInfo();
//			studentlee.showStuInfo();
//			
//			
//		}
	}



