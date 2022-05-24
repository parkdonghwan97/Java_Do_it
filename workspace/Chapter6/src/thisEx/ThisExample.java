package thisEx;
class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		// 자신의 메모리를 가리킴
		this.year = year;
	}
	
	
	public void printThis() {
		System.out.println(this);
		System.out.println(this.year);
	}
}
public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b = new Birthday();
		b.printThis() ;
		
		b.setYear(30);
		b.printThis();
		
		Birthday b2 = new Birthday(); 
		System.out.println(b2); //thisEx.Birthday@1175e2db
		b2.printThis(); //thisEx.Birthday@1175e2db
		
		
	}

}
