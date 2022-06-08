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
		Book book = new Book("강아지와 고양이","홍길동");
		System.out.println(book); //object.Book@7de26db8  => toString 재정의 후 : 강아지와 고양이 ,홍길동
		
		
		String st = new String("test");
		System.out.println(st); //test   String 클래스에는 이미 ToString이 적용 되어 있음
		
		
		
	}

}
