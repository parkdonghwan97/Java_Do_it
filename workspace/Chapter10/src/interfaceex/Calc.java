package interfaceex;

public interface Calc {
	// 인터페이스 요소
	// 상수, 디폴트메서드,추상메서드, 스태틱(정적)메서드, private메서드
	
	
	
	// 아무 키워드를 쓰지 않아도 
	// public static final 이 디폴트로 설정된다.
	double PI = 3.14;
	int ERROR = -99999999;
	
	
	
	int add(int num1, int num2);
	int sum(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);

	
	// 디폴트 메서드
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	//정적메서드               인스턴스 생성 상관없이 사용 가능
	static int total(int[] arr) {
		int total = 0;
		for(int i: arr) {
			total +=i;
		}
		return total;
	}
	
	
}
