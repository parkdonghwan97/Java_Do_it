package staticEx;

public class Student {
	// �л� ��ȣ�� 10000������ �����ϰ���� ��� 
	
	static int serialNum = 10000;
	int studentID;
	String studentName;
	
	public Student() {
		serialNum ++;
		studentID = serialNum;
	}
	
	// private static�ΰ��??
	private static int serialNum2 = 10000;
	
	public static int getSerialNum2() {
		
		int i = 10 ;                      //���������� -> stack�� ���� �ش�޼��� ����� �����
		i++;
		System.out.println(i);
		
		// ����ƽ�޼��忡���� �ν��Ͻ� ���� ��� �Ұ�
//		studentName = "ȫ�浿" ;             (�������)�ν��Ͻ� ���� -> static �޼��� �ε� ������ �ν��Ͻ� ������ �����Ǳ� ���̹Ƿ� static �޼��� �������� �ν��Ͻ� ���� ������ �Ұ���
		
		return serialNum2;                //����ƽ����(Ŭ���� ����)
	}
	
	
	
}
