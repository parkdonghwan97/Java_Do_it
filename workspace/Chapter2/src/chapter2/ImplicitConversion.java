package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		
//		 묵시적 형 변환 
		
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num); //10
		
		long lNum =10;           
		float fNum = lNum; 
		
		System.out.println(fNum); //10.0 형 변환
		
		double dNum = fNum + num ;
		
		System.out.println(dNum + num); // 30.0  정수 + 실수 = 실수 형 변환  
	}

}
