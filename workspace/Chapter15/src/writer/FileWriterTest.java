package writer;

import java.io.FileWriter;

public class FileWriterTest {
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){ //"writer.txt
			fw.write("A");
			char[] cbuf  = {'B','C','D'};
			fw.write(cbuf);
			fw.write("���ڿ��� ����");
			fw.write(cbuf,1,2); // cbuf �迭�� 1������ 2��
			fw.write("123"); // ���ڿ� 123
			
			
		}catch(Exception e){
			System.out.println( e);
		}finally {
			System.out.println("END");
		}
	}
}
