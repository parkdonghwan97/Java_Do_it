package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
		
		// ��Ʈ������ 
		/*
		 *  AND(&) �� ��Ʈ�� ��� 1�� ��� 1 �ƴ� ��� 0
		 *  OR(|) �� ��Ʈ�� ��� 0�ΰ�� 0 �ƴ� ���  1 
		 * << , >>   ��Ʈ�� �������� ���������� �̵�
		 * ~ not
		 * */
		
		int num1 = 5;
		int num2 = 10;
		int result = num1 & num2 ; 
		
		System.out.println(result);  // 0
		
		int num3 = 5;
		int num4 =11;
		
		int result2 = num3 | num4;
		System.out.println(result2); // 15
		
		int num5 = 5;
		System.out.println(num5<<1); //10
		System.out.println(num5<<2); //20
		System.out.println(num5<<3); //40

		System.out.println(num5>>1); //2  00000010
		
		
	}

}
