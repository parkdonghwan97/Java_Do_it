package writer;

import java.io.FileWriter;

public class FileWriterTest {
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){ //"writer.txt
			fw.write("A");
			char[] cbuf  = {'B','C','D'};
			fw.write(cbuf);
			fw.write("문자열도 가능");
			fw.write(cbuf,1,2); // cbuf 배열에 1번부터 2개
			fw.write("123"); // 문자열 123
			
			
		}catch(Exception e){
			System.out.println( e);
		}finally {
			System.out.println("END");
		}
	}
}
