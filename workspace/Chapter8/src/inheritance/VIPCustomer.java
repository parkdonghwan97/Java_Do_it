package inheritance;

public class VIPCustomer extends Customer{

	//�� ��� 
	private double saleRatio;
	private int agentID;
	
	public VIPCustomer(int customerID,String customerName ) {
		
		// super()   ���� Ŭ������ ����Ű�� ������ Ű����  �����ڰ� ȣ���. 
//		super();                      // default �����ڸ� ����Ű�� ������ super()���� �Ű������� ���� ������ ��.  -> �����ڿ��� �Ű������� �Է¹ް��ϰ� super���� �����ϰ� ����
		
		super( customerID,customerName); 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIP(ID,�̸�) ������ ȣ��");
	}
	public int getAgentID() {
		return agentID;
	}
	
}
