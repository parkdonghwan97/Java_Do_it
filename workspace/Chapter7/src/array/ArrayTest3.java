package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		// ���ĺ� �迭 �����ϱ�
		char[] alpahbets = new char[26];
		char ch = 'A'; //65
		
		for(int i=0;i<alpahbets.length;i++,ch++) {
			alpahbets[i] = ch;
		}
		for(int i=0;i<alpahbets.length;i++) {
			System.out.println(alpahbets[i]);
		}
		// ��> �ٵ� �����Ƽ� String ��ü �迭�� ����� ��
	}

}
