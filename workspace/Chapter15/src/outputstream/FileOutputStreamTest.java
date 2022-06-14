package outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		
		
		// 알파벳 배열을 OuputStream
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i=0; i<bs.length;i++) {
			bs[i]= data++;
		}
		
//		FileInputStream fos = new FileInputStream("output.txt");  최근 버전은 이렇게 해도됨.
		try(FileOutputStream fos = new FileOutputStream("output.txt",true) ){ // output.txt 를 생성
							//"output.txt", true를 적을 경우 저장할 때마다 이어서 작성됨
			
			fos.write(65);
			fos.write(66); // 아스키값에 대응하는 값 A B C 가 적힌 output.txt가 생김.
			fos.write(67);
			
			
			fos.write(bs);
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println("end");
		
	}
}
