package interfaceex;

// �������̽��� ����ϴ� �� �Ϻ� �޼��常 ������ ���
// �߻�Ŭ������ �ȴ�.
public abstract class Calculator1 implements Calc{

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int sum(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

//	@Override
//	public int mul(int num1, int num2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int div(int num1, int num2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	
}
