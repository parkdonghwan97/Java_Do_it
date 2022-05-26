package inheritance;

public class Customer {
	protected int customerID;     // protected 는 상속 관계에서는 public 처럼 사용 
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	double bonusRatio;
	
	//새 기능 추가       => default 속성에선 쓰이지 않는 코드
	private int saleRatio;
	private int agentID;
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() 호출");
//	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("customer(ID,이름) 생성자 호출");
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public int calPrice(int price) {
		
		if(customerGrade =="SILVER") { // 만약 등급이 늘어난다면?
			bonusPoint +=price *bonusRatio;
		}
		else if(customerGrade=="VIP") {
			bonusPoint += price * bonusRatio;
			
		}
		return bonusPoint;
	}
		
		
	public String showCustomerInfo() {
		return customerName+"님의 등급은"+customerGrade+"이고, 보너스 포인트는 "+ bonusPoint+"입니다.";
				
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
