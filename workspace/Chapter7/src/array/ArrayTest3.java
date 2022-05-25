package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		// 알파벳 배열 생성하기
		char[] alpahbets = new char[26];
		char ch = 'A'; //65
		
		for(int i=0;i<alpahbets.length;i++,ch++) {
			alpahbets[i] = ch;
		}
		for(int i=0;i<alpahbets.length;i++) {
			System.out.println(alpahbets[i]);
		}
		// ㄴ> 근데 귀찮아서 String 객체 배열을 사용함 ㅋ
	}

}
