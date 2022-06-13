package string;

public class StringTest {

	public static void main(String[] args) {
		
		
		String str1 = new String("abc");
		String str2 = "abc";
		System.out.println(str1);        //abc
		System.out.println(str2);        //abc
		System.out.println(str1==str2);  //false
//		System.err.println(str1.equals(str2));
		
		
		String str3 = "ABC";
		String str4 = "ABC";
		
		System.out.println(str3==str4); //true
		
		
		
		String str5 = "abc";  // �ѹ� ����� ���ڿ��� ������ ����
		
		String str6 = new String("java");
		System.out.println(System.identityHashCode(str6)); //305808283
		String str7 = new String("android");
		
		str6 = str6.concat(str7);
		System.out.println(str6); //javaandroid   ������ java�� ����Ű�� str6�� javaandroid�� ����Ŵ 
		
		System.out.println(System.identityHashCode(str6)); //2111991224  ���� ���� �ٸ� ���� ��µȴ�. �ٸ� �޷θ��� ����Ű�� ����
		
		
		 
		
		
	}
	
}
