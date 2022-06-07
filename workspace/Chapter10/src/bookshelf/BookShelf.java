package bookshelf;
// Queue 인터페이스와 Shelf 클래스를 구현 및 상속하는 BookShelf 클래스

public class BookShelf extends Shelf implements Queue{

	
	
	

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); //0번째 값 제거
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
	
	
	

}
