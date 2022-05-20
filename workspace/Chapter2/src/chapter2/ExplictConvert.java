package chapter2;

public class ExplictConvert {

	public static void main(String[] args) {
		int iNum =1000;
		byte bNum = (byte)iNum;   // (byte)를 이용한 캐스팅
		
		System.out.println(iNum);  //1000
		System.out.println(bNum); // -24
		
		double dNum =3.14;
		iNum = (int)dNum;   // (int)를 이용한 캐스팅
		System.out.println(iNum); // 3.0
		
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum+fNum);
		
		System.out.println(num1); // 3
		System.out.println(num2); // 4
	}

}
