package abstractex;


// �߻�Ŭ������ ����� ���� ����� Ŭ�����̴�.
// ȥ�� ���ư��� Ŭ������ �ƴϰ� new �� �ν��Ͻ�ȭ�� �� �� ����.
// ����� �߻�Ŭ������ �������� ���� Ŭ������ �߻�Ŭ������ ����� Ŭ������ ������ ��.
// ����Ŭ������ �����ؾ��� ������ �ʿ��� �� �߻�Ŭ������ ���


public abstract class Computer {   // abstract �޼��带 ���´ٸ� �� Ŭ������ abstract Ŭ������ �ȴ�.
	
	public abstract void display(); // ������ ����. only �޼��带 ����    
	public abstract void typing();
	
	
//	public  int add(int x , int y) {return x+y ;}
//	public abstract int add(int x , int y); 
	
	
	
	public void turnOn() {
		System.out.println("���� �Ҵ�.");
	}
	public void turnOff() {
		System.out.println("���� ����.");
	} 
	
	
	
}
