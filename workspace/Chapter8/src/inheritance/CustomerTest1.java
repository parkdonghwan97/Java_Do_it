package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		
//		Customer LEE = new Customer();
//		LEE.setCustomerID(10100);
//		LEE.setCustomerName("LEE");
//		LEE.setBonusPoint(100);
		
		
//		VIPCustomer VIPKIM = new VIPCustomer();  // ���� VIP ������ ������ ID�� �̸� �־� �����
//		VIPCustomer VIPKIM = new VIPCustomer(10101,"KIM"); 
		
		// ��ĳ������ ���    ���� Ŭ���� ��ü�� ����ȯ ���� -> ������
		Customer VIPKIM = new VIPCustomer(10101, "KIM");
		VIPKIM.bonusPoint =1000;    //����
		
		// �ٿ�ĳ������ ���  ���� Ŭ���� ��ü�� ����ȯ�� ��������� �������.
		Customer test = new VIPCustomer(1,"TMP");
		VIPCustomer tmp = (VIPCustomer)test ;
		tmp.bonusPoint =1000;    //����
		
		
//		VIPKIM.setCustomerID(10101);
//		VIPKIM.setCustomerName("KIM");
		
		
		VIPKIM.setBonusPoint(200);
		
		
//		System.out.println(LEE.showCustomerInfo());  //LEE���� �����SILVER�̰�, ���ʽ� ����Ʈ�� 100�Դϴ�.
		System.out.println(VIPKIM.showCustomerInfo()); //KIM���� �����VIP�̰�, ���ʽ� ����Ʈ�� 200�Դϴ�.

														//		Customer() ȣ��
														//		VIP ������ ȣ��    
		
		System.out.println(tmp.showCustomerInfo());
	}
}
