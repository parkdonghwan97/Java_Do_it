package abstractex;


// 추상클래스는 상속을 위해 만드는 클래스이다.
// 혼자 돌아가는 클래스가 아니고 new 및 인스턴스화가 될 수 없다.
// 선언된 추상클래스를 바탕으로 하위 클래스가 추상클래스에 기반한 클래스를 구현할 것.
// 하위클래스에 위임해야할 내용이 필요할 때 추상클래스를 사용


public abstract class Computer {   // abstract 메서드를 갖는다면 그 클래스는 abstract 클래스가 된다.
	
	public abstract void display(); // 구현을 안함. only 메서드를 선언만    
	public abstract void typing();
	
	
//	public  int add(int x , int y) {return x+y ;}
//	public abstract int add(int x , int y); 
	
	
	
	public void turnOn() {
		System.out.println("전원 켠다.");
	}
	public void turnOff() {
		System.out.println("전원 끈다.");
	} 
	
	
	
}
