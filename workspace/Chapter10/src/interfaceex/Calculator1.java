package interfaceex;

// 인터페이스를 상속하는 중 일부 메서드만 구현할 경우
// 추상클래스가 된다.
public abstract class Calculator1 implements Calc{

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int sum(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

//	@Override
//	public int mul(int num1, int num2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int div(int num1, int num2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	
}
