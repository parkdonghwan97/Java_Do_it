package object;


class Book{
	String title;
	String author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		
		return title  + " ," + author;
//		return super.toString();  //object.Book@7de26db8  
	}
	
	
}


public class ToStringEx {

	public static void main(String[] args) {
		Book book = new Book("�������� �����","ȫ�浿");
		System.out.println(book); //object.Book@7de26db8  => toString ������ �� : �������� ����� ,ȫ�浿
		
		
		String st = new String("test");
		System.out.println(st); //test   String Ŭ�������� �̹� ToString�� ���� �Ǿ� ����
		
		
		
	}

}
