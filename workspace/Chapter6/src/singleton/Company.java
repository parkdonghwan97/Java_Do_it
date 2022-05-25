package singleton;

public class Company {
	
	// default constructor
//	public Company() {
//	}
	
	

	// singleton -> private
	
	// �� �Ѱ�, ���ο����� 
	private static Company instance = new Company();
	private Company() {
		
	}
	
	// static�� ��������ν�, ��ü�� ������� �ʰ� ������ �ν��Ͻ� ��ü�� �ܺο��� ��� ���� 
	public static Company getInstance() {
		
		
		if(instance ==null) {
			instance = new Company();
		}
		return instance;
	}
}
