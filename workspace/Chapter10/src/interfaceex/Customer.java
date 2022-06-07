package interfaceex;

public class Customer implements Buy,Sell {
	
	
	// 여러 인터페이스를 implement할 때 디폴트 메서드의 이름이 동일하기 때문에 
	// 매서드를 오버라이딩하여 재정의
	
	
	@Override
	public void sell() {
		System.out.println("판매");
	}

	@Override
	public void buy() {
		System.out.println("구매");
	}
	
	
	public void order() {
		System.out.println("고객 판매 주문");
	}

}
