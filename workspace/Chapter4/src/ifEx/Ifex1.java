package ifEx;

public class Ifex1 {

	public static void main(String[] args) {
//		int age =2 ;
		
//		if(age >=8){
//			System.out.println("�б��� �ٴմϴ�.");
//		}
//		else {
//			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
//		}
		
		
		int age = 9;
		int charge = 0;
		
		if (age < 8 ) {
			charge = 1000;
			System.out.println("������ �Ƶ�");
		}
		else if (age<14) {
			System.out.println("�ʵ��л�");
			charge = 2000;
		}
		else if (age<20) {
			System.out.println("û�ҳ�");
			charge = 3000;
		}
		else {
			System.out.println("����");
			charge = 4000;
		}
		System.out.println("������ "+ charge +"�� �Դϴ�.");
	}
	

}
