package template;

public abstract class Car {
	
	
	// ���� ���� �޸��� ���ߴ� ������ �ٸ��� �� ��� �߻�޼��� ��� 
	public abstract void drive();
	public abstract void stop();

	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void stopCar() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	
	public abstract void wiper();
	public  void washCar() {}; //    ���� Ŭ�������� �ʿ信 ���� ������
	
	// �ٲ��� �ʴ� �޼��� ���� ��� fianl�� �ٿ� ����Ŭ�������� ������ ���ϵ��� ��.
	
	public final void run() {    // �õ��� �Ѽ� ���� �� �õ��� ���� ������ ���� �޼��� run
//	final public void run() { �̷��� �ᵵ ����	
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		stopCar();
	}
	
	
}
