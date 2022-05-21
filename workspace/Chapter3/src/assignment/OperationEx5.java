package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
		
		// 비트연산자 
		/*
		 *  AND(&) 두 비트가 모두 1인 경우 1 아닌 경우 0
		 *  OR(|) 두 비트가 모두 0인경우 0 아닌 경우  1 
		 * << , >>   비트를 왼쪽으로 오른쪽으로 이동
		 * ~ not
		 * */
		
		int num1 = 5;
		int num2 = 10;
		int result = num1 & num2 ; 
		
		System.out.println(result);  // 0
		
		int num3 = 5;
		int num4 =11;
		
		int result2 = num3 | num4;
		System.out.println(result2); // 15
		
		int num5 = 5;
		System.out.println(num5<<1); //10
		System.out.println(num5<<2); //20
		System.out.println(num5<<3); //40

		System.out.println(num5>>1); //2  00000010
		
		
	}

}
