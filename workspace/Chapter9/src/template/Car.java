package template;

public abstract class Car {
	
	
	// 차에 따라 달리고 멈추는 내용을 다르게 할 경우 추상메서드 사용 
	public abstract void drive();
	public abstract void stop();

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void stopCar() {
		System.out.println("시동을 끕니다.");
	}
	
	
	public abstract void wiper();
	public  void washCar() {}; //    하위 클래스에서 필요에 의해 재정의
	
	// 바뀌지 않는 메서드 같은 경우 fianl을 붙여 하위클래스에서 재정의 못하도록 함.
	
	public final void run() {    // 시동을 켜서 주행 후 시동을 끄는 과정을 담은 메서드 run
//	final public void run() { 이렇게 써도 가능	
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		stopCar();
	}
	
	
}
