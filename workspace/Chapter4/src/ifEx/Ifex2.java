package ifEx;

public class Ifex2 {

	public static void main(String[] args) {
		int age = 9;
		int charge = 0;
		
		if (age < 8 ) {
			charge = 1000;
			System.out.println("������ �Ƶ�");
		}
		if (age<14) {
			System.out.println("�ʵ��л�");
			charge = 2000;
		}
		if (age<20) {
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

