package loop;

public class WhileEx {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while (num<=10) {
			sum +=num;
			num++;
		}
		System.out.println("1���� 10���� ��"+sum);
		
		
		// ���� �ݺ� - > ������ �ξ� break�� Ż��
		
			int num2 = 1;
			int sum2 = 0;
			while (true){
				sum2 +=num2;
				
			if (sum2==55) {
				break ; 
			}
			
			}
			System.out.println("1���� 10���� ��"+sum2);
			
			
		// do -while��   ������ 1���� �ݺ�
			
			int num3 = 1;
			int sum3 = 0;
			
			do {
				sum3+=num3;
				num3++;
			}while(num3<=10);
			System.out.println("1���� 10���� ��"+sum3);
			
		
	}

}
