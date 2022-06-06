package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		
		Calc calc1 = new CompleteCalc(); // CompleteCalc가 Calc를 내포하고 있음. 타입을 상속받는 것.
//		Calc calc2 = new Calc(); 
//		Calc calc3 = new Calc();
		Calculator1 calc2 = new CompleteCalc();
		CompleteCalc calc3 = new CompleteCalc();
		
		
		
		System.out.println(calc1.add(num1, num2)); //12
		
		System.out.println(calc2.add(num1, num2)); //12
		
		
		// showInfo는 CompleteCalc에서만 사용 가능하다.
//		calc1.showInfo();
//		calc2.showInfo();
		calc3.showInfo();
	
	
	}
}
