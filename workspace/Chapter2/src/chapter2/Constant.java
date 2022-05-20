package chapter2;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM=100;  //상수 앞에 final + 대문자로 사용
		final double PI = 3.14f; 
		
//		PI = 3.15f;     fianl 상수로 선언한 값은 후에 변경 불가
		
		final int STU_NUM = 30;
		int num=0;
		if(num==STU_NUM) {}
		System.out.println(STU_NUM);
		
	}

}
