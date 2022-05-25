package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
//		Company company = new Company(); //Singleton -> 외부에서 construtor 호출 불가
		
		
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1==c2); //true
		
			
		Calendar cal = Calendar.getInstance(); // 기본 제공하는 싱글턴 패턴의 예 Calendar 
		System.out.println(cal);
		
		
		
		//
//		Company c3 = new Company();  에러 
		
		
		
		
	}

}
