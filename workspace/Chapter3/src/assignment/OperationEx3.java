package assignment;

public class OperationEx3 {

	public static void main(String[] args) {
		
		// 단락 회로 평가 (short circuit evaluation)
		
		int num1 = 10;
		int i = 2;
		
		boolean check = (  (num1= num1+10 ) >10   ) && (  ((i=i+2)>10 )) ;
		
		System.out.println(check); // f 
		System.out.println(num1); //20
		System.out.println(i); // 4 
		
		int num2 = 10;
		int i2 = 2;
		
		boolean check2 = (  (num2= num2+10 ) <10   ) && (  ((i2=i2+2)>10 )) ;
		
		System.out.println(check2); // f 
		System.out.println(num2); //20
		System.out.println(i2); // 2
		
		
	}
	
	

}
