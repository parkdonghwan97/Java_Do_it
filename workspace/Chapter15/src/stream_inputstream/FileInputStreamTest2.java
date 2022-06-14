package stream_inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			byte[] bs = new byte[10];
			int i;
			while((i=fis.read(bs))!=-1) {
//				for(byte b :bs) {
//					System.out.print((char)b);
//				}
				for (int j =0; j<i;j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println();
			}
			
			
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
