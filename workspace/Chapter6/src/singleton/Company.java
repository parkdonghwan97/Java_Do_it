package singleton;

public class Company {
	
	// default constructor
//	public Company() {
//	}
	
	

	// singleton -> private
	
	// 단 한개, 내부에서만 
	private static Company instance = new Company();
	private Company() {
		
	}
	
	// static을 사용함으로써, 객체를 사용하지 않고 생성된 인스턴스 객체를 외부에서 사용 가능 
	public static Company getInstance() {
		
		
		if(instance ==null) {
			instance = new Company();
		}
		return instance;
	}
}
