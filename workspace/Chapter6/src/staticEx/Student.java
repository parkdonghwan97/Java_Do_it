package staticEx;

public class Student {
	// 학생 번호를 10000번부터 시작하고싶은 경우 
	
	static int serialNum = 10000;
	int studentID;
	String studentName;
	
	public Student() {
		serialNum ++;
		studentID = serialNum;
	}
	
	// private static인경우??
	private static int serialNum2 = 10000;
	
	public static int getSerialNum2() {
		
		int i = 10 ;                      //지역변수임 -> stack에 생성 해당메서드 종료시 사라짐
		i++;
		System.out.println(i);
		
		// 스태틱메서드에서는 인스턴스 변수 사용 불가
//		studentName = "홍길동" ;             (멤버변수)인스턴스 변수 -> static 메서드 로딩 시점은 인스턴스 변수가 생성되기 전이므로 static 메서드 내에서는 인스턴스 변수 접근이 불가능
		
		return serialNum2;                //스태틱변수(클래스 변수)
	}
	
	
	
}
