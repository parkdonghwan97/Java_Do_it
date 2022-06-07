package interfaceex;

public class CalculatorTest { // 인터페이스를 기반으로 구현된 인스턴스 클래스를 가져다 쓰는 '클라이언트 코드'

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
		
		Calc calc4 = new CompleteCalc();
		calc4.description();
		
		// Calc의 정적메서드 total메서드 사용
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
		
	
	
	}
}
