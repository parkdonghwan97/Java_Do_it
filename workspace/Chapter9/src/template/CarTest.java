package template;

public class CarTest {
	public static void main(String[] args) {
		
		Car myCar = new ManualCar();
		myCar.run();
	
//		�õ��� �մϴ�.
//		����� ������ �մϴ�.
//		����� �ڵ��� �����մϴ�.
//		�����۸� �������� �����մϴ�.
//		����� �극��ũ�� ����ϴ�.
//		�õ��� ���ϴ�.
		
		System.out.println("===============================");
		
		Car yourCar = new AICar();
		yourCar.run();
		
//		�õ��� �մϴ�.
//		���� ���� �ڵ��� �Դϴ�.
//		�ڵ����� ������ ������ ��ȯ�մϴ�.
//		�� ���� �翡 ���� �ڵ����� �����մϴ�.
//		�ڵ����� ������ ����ϴ�.
//		�õ��� ���ϴ�.
		
	}
}
