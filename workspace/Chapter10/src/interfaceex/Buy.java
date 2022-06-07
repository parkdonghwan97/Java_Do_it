package interfaceex;

public interface Buy {
	void buy();
	
	
	
	default void order() {
		System.err.println("구매 주문");
	}
}
