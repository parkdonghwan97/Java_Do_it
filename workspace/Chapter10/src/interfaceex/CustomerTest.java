package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.buy(); //구매
		customer.sell(); //판매
		
		
		Buy buyer = customer;
		buyer.buy();	//구매
		
		Sell seller = customer;
		seller.sell();	//판매
		
	
		customer.order(); //고객 판매 주문
		buyer.order();    //고객 판매 주문
		seller.order();   //고객 판매 주문
		
		
	}

}
