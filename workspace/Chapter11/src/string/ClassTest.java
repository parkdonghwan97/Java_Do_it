package string;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		Person person = new Person();
		
		Class pClass1 = person.getClass(); // Object클래스의 getClass메서드 : 클래스 클래스를 반환 
		
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 =Class.forName("java.lang.String"); //문자열에 해당하는 클래스가 있다면 메모리에 로딩
		System.out.println(pClass3.getName());
		
//		Class pClass4 =Class.forName("java.lang.String222"); //문자열에 해당하는 클래스가 없다면 오류 
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
