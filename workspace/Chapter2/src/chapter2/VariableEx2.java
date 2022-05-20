package chapter2;

public class VariableEx2 {

	public static void main(String[] args) {
//		int num =10;
//		int level = 50;
		
//		int num =12345678900;    # 범위 초과 32비트 초과하는 숫자는long사용 
//		long num =12345678900;  12345678900 은 기본이 int, int범위 넘는 수는 long으로 처리할 필요가 있음.
		long num = 12345678900L;  
		System.out.println(num);
		
	}

}
