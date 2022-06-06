package interfaceex;

public interface Calc {
	
	// 아무 키워드를 쓰지 않아도 
	// public static final 이 디폴트로 설정된다.
	double PI = 3.14;
	int ERROR = -99999999;
	
	
	
	int add(int num1, int num2);
	int sum(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);

}
