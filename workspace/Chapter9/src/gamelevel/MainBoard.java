package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		
		
		Player player = new Player();
		player.play(1);
//		### �ʺ��� ###
//		�ʺ��� : õõ�� �޸��ϴ�
//		�ʺ��� : jump ����
//		�ʺ��� : turn ����
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
//		### �߼� ###
//		�߼� : ������ �޸��ϴ�
//		�߼� : ���� �����մϴ�.
//		�߼� : ���� �����մϴ�.
//		�߼� : turn ����
		
		SuperLevel sLevel  = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
//		### ��� ###
//		��� : ������ �޸��ϴ�
//		��� : ���� �����մϴ�.
//		��� : ���� �����մϴ�.
//		��� : ���� �����մϴ�.
//		��� : �ѹ��� ���ϴ�.

		
		
	}

}
