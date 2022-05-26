package inheritance;

public class Customer {
	protected int customerID;     // protected �� ��� ���迡���� public ó�� ��� 
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	double bonusRatio;
	
	//�� ��� �߰�       => default �Ӽ����� ������ �ʴ� �ڵ�
	private int saleRatio;
	private int agentID;
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() ȣ��");
//	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("customer(ID,�̸�) ������ ȣ��");
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public int calPrice(int price) {
		
		if(customerGrade =="SILVER") { // ���� ����� �þ�ٸ�?
			bonusPoint +=price *bonusRatio;
		}
		else if(customerGrade=="VIP") {
			bonusPoint += price * bonusRatio;
			
		}
		return bonusPoint;
	}
		
		
	public String showCustomerInfo() {
		return customerName+"���� �����"+customerGrade+"�̰�, ���ʽ� ����Ʈ�� "+ bonusPoint+"�Դϴ�.";
				
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
