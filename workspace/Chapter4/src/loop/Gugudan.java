package loop;

public class Gugudan {

	public static void main(String[] args) {
		
		int dan;
		int times;
		// 2�� for��
		for (dan=2; dan<=9; dan++) {
			for (times=1; times<=9;times++) {
				System.out.println(dan+" X "+times+" = "+dan*times);
			}
			
			
		}
		
		// while������
		int dan2 = 2;
		
		while(dan2<=9) {
			int times2 = 1;
			
			while(times2<=9) {
				System.out.println(dan2+" X "+times2+" = "+dan2*times2);
				times2++;
			}
			dan2++;
				
			
		}
		
	}

}
