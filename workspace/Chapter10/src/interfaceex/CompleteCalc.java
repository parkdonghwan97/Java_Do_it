package interfaceex;

public class CompleteCalc extends Calculator1{

	@Override
	public int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int div(int num1, int num2) {
		
		if(num2!=0) {
			return num1/num2;
		}
		return ERROR;
	}
	public void showInfo() {
		System.out.println("Calc 인터페이스 구현");
	}

}
