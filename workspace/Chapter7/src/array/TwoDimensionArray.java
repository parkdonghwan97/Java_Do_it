package array;

public class TwoDimensionArray {
	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];   // 2행 3열 
		
		System.out.println(arr.length); // arr의 길이는 행의 길이
		
		System.out.println(arr[0].length); // 3 
		System.out.println(arr[1].length); // 3
		
		
		// 모든 배열 값 출력 
		for(int i=0;i<arr.length;i++) {
			for (int j =0 ;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);

			}
				System.out.println();
		}
		
		// 알파벳 넣어보기  A= 65 , a = 97 
//		char[][] alpahbets = new char[13][2];
//		
//		
//		System.out.println(alpahbets.length); // 13 
//		
//		char ar = 'a';
//		
//		for(int i = 0 ; i<alpahbets.length;i++) {
//			for(int j = 0 ; j < alpahbets[i].length; j++, ar++  ) {
//				alpahbets[i][j]  = ar;
//				System.out.println(alpahbets[i][j]);
//			}
//		}
//		char ar2='A';
//		for(int i = 0 ; i<alpahbets.length;i++) {
//			for(int j = 0 ; j < alpahbets[i].length; j++, ar2++  ) {
//				alpahbets[i][j]  = ar2;
//				System.out.println(alpahbets[i][j]);
//			}
//		}
		
	}

}
