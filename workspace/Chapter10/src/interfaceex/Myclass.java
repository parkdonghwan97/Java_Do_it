package interfaceex;

/// 인터페이스 X와 Y를 상속받는 Myinterface 인터페이스를 구현한 Myclass
public class Myclass implements Myinterface{

	@Override
	public void x() {
		System.out.println("X()");
	}

	@Override
	public void y() {
		System.out.println("Y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
	
	public static void main(String[] args) {
		Myclass my = new Myclass();
		my.x();
		my.y();
		my.myMethod();
		
		X x = my;
		x.x();
//		x.y();  불가
		
		
		Y y = my;
		y.y();
//		y.x(); 불가
		
	}
	

}
