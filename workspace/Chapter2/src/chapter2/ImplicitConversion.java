package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		
//		 ������ �� ��ȯ 
		
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num); //10
		
		long lNum =10;           
		float fNum = lNum; 
		
		System.out.println(fNum); //10.0 �� ��ȯ
		
		double dNum = fNum + num ;
		
		System.out.println(dNum + num); // 30.0  ���� + �Ǽ� = �Ǽ� �� ��ȯ  
	}

}