package scheduler;

public class RoundRobin implements Scheduler{

	@Override
	public void getNectCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� ������");
	}

	@Override
	public void sendCallToAgent() {
		
		System.out.println("���� ���� �������� ���");
		
	}

}
