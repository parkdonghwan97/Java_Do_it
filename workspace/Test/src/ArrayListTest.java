import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0 ; i<list.size();i++) {
			System.out.println(list.get(i));
//			System.out.println(list[i]);  ArrayList에선 인젝스 제공 안함.
		}
		
		ArrayList list2 = new ArrayList();              // <type>지정 안해도 되긴 됨.
		list2.add("aaa");
		list2.add("bbb");
		list2.add("ccc");
		
		
		for(int i=0 ; i<list2.size();i++) {
			String s = (String)list.get(i); // 캐스팅 해줘야함  근데 이거 잘 안쓴다고 하네.
//			System.out.println(list2.get(i));
		}
		
		
		
		
	}

}
