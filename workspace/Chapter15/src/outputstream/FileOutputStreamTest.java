package outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		
		
		// ���ĺ� �迭�� OuputStream
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i=0; i<bs.length;i++) {
			bs[i]= data++;
		}
		
//		FileInputStream fos = new FileInputStream("output.txt");  �ֱ� ������ �̷��� �ص���.
		try(FileOutputStream fos = new FileOutputStream("output.txt",true) ){ // output.txt �� ����
							//"output.txt", true�� ���� ��� ������ ������ �̾ �ۼ���
			
			fos.write(65);
			fos.write(66); // �ƽ�Ű���� �����ϴ� �� A B C �� ���� output.txt�� ����.
			fos.write(67);
			
			
			fos.write(bs);
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println("end");
		
	}
}
