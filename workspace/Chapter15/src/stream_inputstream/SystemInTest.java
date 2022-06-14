package stream_inputstream;

import java.io.IOException;

public class SystemInTest {
	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 입력하세요");
		int i = 0 ;
		try {
			while((i = System.in.read()) != '\n') {
				System.out.println(i); //아스키 값 출력 
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
