package abstractex;

public class DeskTop extends Computer {
	
	// �߻�Ŭ������ ��ӹ޴� ��� 
	// �������� ���� �޼������ �߰��ϰų� 
	// ��ӹ޴� Ŭ������ �߻�Ŭ������ ������Ѿ� �Ѵ�.

	@Override
	public void display() {
		System.out.println("DeskTop display()");
		
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing");
	}

	
	// �޼��� �籸��  (�������̵�)
	public void turnOn() {	
		System.out.println("DeskTop TurnOn");
	}

}
