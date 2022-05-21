package loop;

public class ForEx3 {

	public static void main(String[] args) {
		int tot = 0;
		int num;
		for (num=1;num<=100;num++) {
			
			// �汝鶺� 唳辦 
			if(num % 2 ==1) {
				continue;  // pass
			}
			
			tot+=num;
		}
		System.out.println(tot); //2550
		int tot2 = 0;
		int num2;
		for (num2=1;num2<=100;num2++) {
			
			// 礎熱檣 唳辦 
			if(num2 % 2 ==0) {
				continue;  // pass
			}
			
			tot2+=num2;
		}
		System.out.println(tot2); //2500

	}
	

}
