import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0 ; i<list.size();i++) {
			System.out.println(list.get(i));
//			System.out.println(list[i]);  ArrayList���� ������ ���� ����.
		}
		
		ArrayList list2 = new ArrayList();              // <type>���� ���ص� �Ǳ� ��.
		list2.add("aaa");
		list2.add("bbb");
		list2.add("ccc");
		
		
		for(int i=0 ; i<list2.size();i++) {
			String s = (String)list.get(i); // ĳ���� �������  �ٵ� �̰� �� �Ⱦ��ٰ� �ϳ�.
//			System.out.println(list2.get(i));
		}
		
		
		
		
	}

}
