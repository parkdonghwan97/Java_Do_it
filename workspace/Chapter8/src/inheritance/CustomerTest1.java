package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		
//		Customer LEE = new Customer();
//		LEE.setCustomerID(10100);
//		LEE.setCustomerName("LEE");
//		LEE.setBonusPoint(100);
		
		
//		VIPCustomer VIPKIM = new VIPCustomer();  // 여기 VIP 생성할 때에도 ID와 이름 넣어 줘야함
//		VIPCustomer VIPKIM = new VIPCustomer(10101,"KIM"); 
		
		// 업캐스팅의 경우    상위 클래스 객체로 형변환 가능 -> 묵시적
		Customer VIPKIM = new VIPCustomer(10101, "KIM");
		VIPKIM.bonusPoint =1000;    //가능
		
		// 다운캐스팅의 경우  하위 클래스 객체료 형변환시 명시적으로 적어야함.
		Customer test = new VIPCustomer(1,"TMP");
		VIPCustomer tmp = (VIPCustomer)test ;
		tmp.bonusPoint =1000;    //가능
		
		
//		VIPKIM.setCustomerID(10101);
//		VIPKIM.setCustomerName("KIM");
		
		
		VIPKIM.setBonusPoint(200);
		
		
//		System.out.println(LEE.showCustomerInfo());  //LEE님의 등급은SILVER이고, 보너스 포인트는 100입니다.
		System.out.println(VIPKIM.showCustomerInfo()); //KIM님의 등급은VIP이고, 보너스 포인트는 200입니다.

														//		Customer() 호출
														//		VIP 생성자 호출    
		
		System.out.println(tmp.showCustomerInfo());
	}
}
