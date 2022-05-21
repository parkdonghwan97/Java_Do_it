package ifEx;

public class Ifex2 {

	public static void main(String[] args) {
		int age = 9;
		int charge = 0;
		
		if (age < 8 ) {
			charge = 1000;
			System.out.println("미취학 아동");
		}
		if (age<14) {
			System.out.println("초등학생");
			charge = 2000;
		}
		if (age<20) {
			System.out.println("청소년");
			charge = 3000;
		}
		else {
			System.out.println("성인");
			charge = 4000;
		}
		System.out.println("입장료는 "+ charge +"원 입니다.");
	}
	


	}

