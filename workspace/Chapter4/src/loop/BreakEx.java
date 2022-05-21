package loop;

public class BreakEx {

	public static void main(String[] args) {
		int sum = 0 ;
		int num = 1 ;
		
		
		// 1sum이 100보다 작은경우 반복
		while( sum <100 ) {
			sum +=num;
			num++;
			
		}
		System.out.println(num); //15
		System.out.println(sum); //105
		
		// sum이 100 보다 큰경우 반복 종료
		int sum2 = 0 ;
		int num2 = 1 ;
		
		
		// sum2이 100보다 작은경우 반복
		while( true ) {
			
			sum2+=num2;
			if (sum2 >100) 
				break ; 
				num2++;
			
		}
		System.out.println(num2); //14
		System.out.println(sum2); //105
	}

}
