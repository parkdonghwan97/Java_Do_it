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
	}



