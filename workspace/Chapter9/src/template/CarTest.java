package template;

public class CarTest {
	public static void main(String[] args) {
		
		Car myCar = new ManualCar();
		myCar.run();
	
//		시동을 켭니다.
//		사람이 운전을 합니다.
//		사람이 핸들을 조작합니다.
//		와이퍼를 수동으로 조작합니다.
//		사람이 브레이크를 밟습니다.
//		시동을 끕니다.
		
		System.out.println("===============================");
		
		Car yourCar = new AICar();
		yourCar.run();
		
//		시동을 켭니다.
//		자율 주행 자동차 입니다.
//		자동차가 스스로 방향을 전환합니다.
//		비나 눈의 양에 따라 자동으로 조절합니다.
//		자동차가 스스로 멈춥니다.
//		시동을 끕니다.
		
	}
}
