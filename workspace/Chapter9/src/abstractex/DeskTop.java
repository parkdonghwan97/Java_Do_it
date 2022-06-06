package abstractex;

public class DeskTop extends Computer {
	
	// 추상클래스를 상속받는 경우 
	// 구현되지 않은 메서드들을 추가하거나 
	// 상속받는 클래스를 추상클래스로 변경시켜야 한다.

	@Override
	public void display() {
		System.out.println("DeskTop display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing");
	}

	
	// 메서드 재구현  (오버라이딩)
	public void turnOn() {	
		System.out.println("DeskTop TurnOn");
	}

}
