package bookshelf;

public class BookTest {

	public static void main(String[] args) {
		
		
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("�¹���1");
		shelfQueue.enQueue("�¹���2");
		shelfQueue.enQueue("�¹���3");
		
		
		System.out.println(shelfQueue.deQueue()); //�¹���1
		System.out.println(shelfQueue.deQueue()); //�¹���2
		System.out.println(shelfQueue.deQueue()); //�¹���3
		
		
		
		
		
		
	}

}
