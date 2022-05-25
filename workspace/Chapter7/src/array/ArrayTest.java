package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int num = 10;
		int[] numbers1 = new int[10];
		int numbers2[] = new int[10];
		
		
		System.out.println(numbers1);
		System.out.println(numbers2);
		
		System.out.println(numbers1.length);

		
		int[] numbers = {0,1,2};  
		
		System.out.println(numbers[0] + "," + numbers[1]+ "," + numbers[2]);
		
		
		int[] numbers4 = new int[] {0,1,2} ; 
		
		System.out.println(numbers4[0] + "," + numbers4[1]+ "," + numbers4[2]);
		
		
		
		// 선언만 따로 할 수도 있음
		
		int[] numbers5 ;
		numbers5 = new int[3];
		
		numbers5[0] = 1;
		numbers5[1] = 2;
		numbers5[2] = 3;

		for(int i=0; i<numbers5.length;i++ ) {
			System.out.print(numbers5[i]);
		}
		System.out.println();
		
		// 선언만 한경우 디폴트 값 확인
		int[] studentIDs = new int[10];
		
		for(int i=0; i<studentIDs.length;i++ ) {
			System.out.print(studentIDs[i]);
		}
		System.out.println();		
		double[] studentIDs2 = new double[10];
				
		for(int i=0; i<studentIDs2.length;i++ ) {
			System.out.print(studentIDs2[i]);
		}
		System.out.println();		
		String[] studentnames = new String[10];
		
		for(int i=0; i<studentnames.length;i++ ) {
			System.out.print(studentnames[i]);
		}
		System.out.println();
		
		
		
	}

}
