package interfaceex;

public interface Calc {
	// �������̽� ���
	// ���, ����Ʈ�޼���,�߻�޼���, ����ƽ(����)�޼���, private�޼���
	
	
	
	// �ƹ� Ű���带 ���� �ʾƵ� 
	// public static final �� ����Ʈ�� �����ȴ�.
	double PI = 3.14;
	int ERROR = -99999999;
	
	
	
	int add(int num1, int num2);
	int sum(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);

	
	// ����Ʈ �޼���
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
	}
	
	//�����޼���               �ν��Ͻ� ���� ������� ��� ����
	static int total(int[] arr) {
		int total = 0;
		for(int i: arr) {
			total +=i;
		}
		return total;
	}
	
	
}
