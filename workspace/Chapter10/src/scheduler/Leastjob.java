package scheduler;

public class Leastjob implements Scheduler{

	@Override
	public void getNectCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� ������");
	}

	@Override
	public void sendCallToAgent() {
		
		System.out.println("���� �������� ���ų� ����Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
		
	}

}
