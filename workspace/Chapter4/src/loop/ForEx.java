package loop;

public class ForEx {

	public static void main(String[] args) {
		
		int num =1;
		int sum = 0;
		while(num<=10) {
			sum+=num;
			num++;
		}
		System.out.println(sum); //55
		System.out.println(num); //11

		
		int sum2 = 0;
		int num2 ;
		for(num2 = 1; num2<=10; num2++) {
			sum2 += num2;
		}
		System.out.println(sum2); //55
		System.out.println(num2); //11
	
	}
		

}
