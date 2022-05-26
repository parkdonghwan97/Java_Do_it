package inheritance;

public class VIPCustomer extends Customer{

	//새 기능 
	private double saleRatio;
	private int agentID;
	
	public VIPCustomer(int customerID,String customerName ) {
		
		// super()   상위 클래스를 가리키는 참조자 키워드  생성자가 호출됨. 
//		super();                      // default 생성자를 가리키기 떄문에 super()에는 매개변수가 없어 오류가 남.  -> 생성자에게 매개변수를 입력받게하고 super에도 동일하게 적용
		
		super( customerID,customerName); 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIP(ID,이름) 생성자 호출");
	}
	public int getAgentID() {
		return agentID;
	}
	
}
