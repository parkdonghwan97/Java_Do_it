package interfaceex;

/// �������̽� X�� Y�� ��ӹ޴� Myinterface �������̽��� ������ Myclass
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
//		x.y();  �Ұ�
		
		
		Y y = my;
		y.y();
//		y.x(); �Ұ�
		
	}
	

}
