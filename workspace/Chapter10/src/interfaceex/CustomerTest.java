package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.buy(); //����
		customer.sell(); //�Ǹ�
		
		
		Buy buyer = customer;
		buyer.buy();	//����
		
		Sell seller = customer;
		seller.sell();	//�Ǹ�
		
	
		customer.order(); //�� �Ǹ� �ֹ�
		buyer.order();    //�� �Ǹ� �ֹ�
		seller.order();   //�� �Ǹ� �ֹ�
		
		
	}

}
