package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010,"이순신");
		Customer customerShin = new Customer(10011,"신사임당");
		Customer customerHong = new GoldCustomer(10012,"홍길동");
		Customer customerYul = new GoldCustomer(10013,"율곡이이");
		Customer customerKIM = new VIPCustomer(10014,"김유신",12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKIM);
		
		System.out.println("=========================== 고객정보 출력 ========================");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("=========================== 할인율과 보너스 포인트 결과 ========================");
		
		int price= 10000;
		for(Customer customer : customerList) {
			 int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerID()+"님이"+cost+"를 지불하셨습니다.");
			System.out.println(customer.showCustomerInfo());
		}
	}

}
