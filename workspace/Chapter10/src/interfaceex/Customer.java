package interfaceex;

public class Customer implements Buy,Sell {
	
	
	// ���� �������̽��� implement�� �� ����Ʈ �޼����� �̸��� �����ϱ� ������ 
	// �ż��带 �������̵��Ͽ� ������
	
	
	@Override
	public void sell() {
		System.out.println("�Ǹ�");
	}

	@Override
	public void buy() {
		System.out.println("����");
	}
	
	
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}

}
