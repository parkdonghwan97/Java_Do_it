package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer(10010, "Lee");
//		customerLee.calcPrice(10000);
//		System.out.println(customerLee.showCustomerInfo());
//		
//		VIPCustomer customerkim = new VIPCustomer(10010, "Lee",100);
//		customerkim.calcPrice(10000);
//		System.out.println(customerkim.showCustomerInfo());
		
		Customer customerWho = new VIPCustomer(10010, "who", 100);
		int price = customerWho.calcPrice(1000);
		System.out.println(customerWho.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
		
	}

}