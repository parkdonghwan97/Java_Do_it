package stream_inputstream;

import java.io.IOException;

public class SystemInTest {
	public static void main(String[] args) {
		
		System.out.println("���ĺ� �ϳ��� �Է��ϼ���");
		int i = 0 ;
		try {
			while((i = System.in.read()) != '\n') {
				System.out.println(i); //�ƽ�Ű �� ��� 
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
