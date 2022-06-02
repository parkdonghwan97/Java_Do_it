package witharraylist;

public class VIPCustomer extends Customer {

	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	
	}
	public VIPCustomer(int customerID, String customerName,int agentID) {
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID =agentID;
	}





	public int getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint +=price *bonusPoint;
		return price - (int)(price*saleRatio);
	}
	@Override
	
	public String showCustomerInfo() {
		
		
		return super.showCustomerInfo()+"��� ���� ���̵�� "+agentID+"�Դϴ�.";
	}



	

	
}