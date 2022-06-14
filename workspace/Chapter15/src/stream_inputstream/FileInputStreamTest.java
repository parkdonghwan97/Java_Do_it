package stream_inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		
		int i = 0 ;
		FileInputStream fls = null;
		try {
			fls = new FileInputStream("input.txt");
		while(  (i=fls.read()) != -1  ) {
			System.out.print((char)(i));
		}
//		System.out.print((char)fls.read());  // input.txt의 문자열을 읽어와 a b c 출력
//		System.out.print((char)fls.read());
//		System.out.println((char)fls.read());
		}
		catch(IOException e) {
			System.out.println(e);
		}finally{
			try {
				fls.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println();
		System.out.println("end");
		
		
		FileReader fls2 = null;
		i = 0;
		try {
			fls2 = new FileReader("input.txt");
		while(  (i=fls2.read()) != -1  ) {
			System.out.print((char)(i));
		}
//		System.out.print((char)fls.read());  // input.txt의 문자열을 읽어와 a b c 출력
//		System.out.print((char)fls.read());
//		System.out.println((char)fls.read());
		}
		catch(IOException e) {
			System.out.println(e);
		}finally{
			try {
				fls.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}catch(NullPointerException e) {
				System.out.println(e);
			}
		}
		
		
		
		
		
		
	}
}
