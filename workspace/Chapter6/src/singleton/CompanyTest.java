package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
//		Company company = new Company(); //Singleton -> �ܺο��� construtor ȣ�� �Ұ�
		
		
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1==c2); //true
		
			
		Calendar cal = Calendar.getInstance(); // �⺻ �����ϴ� �̱��� ������ �� Calendar 
		System.out.println(cal);
		
		
		
		//
//		Company c3 = new Company();  ���� 
		
		
		
		
	}

}
