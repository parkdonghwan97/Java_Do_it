package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("�ʺ��� : õõ�� �޸��ϴ�");
	}

	@Override
	public void jump() {
		System.out.println("�ʺ��� : jump ����");
	}

	@Override
	public void turn() {
		System.out.println("�ʺ��� : turn ����");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("### �ʺ��� ###");
	}

}
