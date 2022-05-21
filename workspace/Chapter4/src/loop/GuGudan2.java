package loop;

public class GuGudan2 {

	public static void main(String[] args) {
		
		// 구구단 짝수의 단만 출력
		
		int a;
		int b ;
		for (a=2;a<=9;a++) {
			
			for (b=2;b<=9;b++) {
				
				if(a%2 ==0) {
					System.out.println(a+" X "+b+" = "+ a*b);
				}
				
			}
			
		}
		
	}

}
