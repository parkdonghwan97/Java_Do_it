package loop;

public class WhileEx {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while (num<=10) {
			sum +=num;
			num++;
		}
		System.out.println("1부터 10까지 합"+sum);
		
		
		// 무한 반복 - > 조건을 두어 break로 탈출
		
			int num2 = 1;
			int sum2 = 0;
			while (true){
				sum2 +=num2;
				
			if (sum2==55) {
				break ; 
			}
			
			}
			System.out.println("1부터 10까지 합"+sum2);
			
			
		// do -while문   무조건 1번은 반복
			
			int num3 = 1;
			int sum3 = 0;
			
			do {
				sum3+=num3;
				num3++;
			}while(num3<=10);
			System.out.println("1부터 10까지 합"+sum3);
			
		
	}

}
