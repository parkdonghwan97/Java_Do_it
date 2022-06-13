package string;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Person person = new Person();
		
		Class pClass1 = person.getClass(); // ObjectŬ������ getClass�޼��� : Ŭ���� Ŭ������ ��ȯ 
		
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 =Class.forName("java.lang.String"); //���ڿ��� �ش��ϴ� Ŭ������ �ִٸ� �޸𸮿� �ε�
		System.out.println(pClass3.getName());
		
//		Class pClass4 =Class.forName("java.lang.String222"); //���ڿ��� �ش��ϴ� Ŭ������ ���ٸ� ���� 
//		System.out.println(pClass4.getName());
		
		
		Class strClass = Class.forName("java.lang.String");
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		Field[] fields = strClass.getFields();
		
		for(Field f : fields) {
			System.out.println(f);
		}
		
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}
}
