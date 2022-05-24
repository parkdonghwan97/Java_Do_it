package thisEx;


class Person{
	
	String name;
	int age;
	
	public Person() {
//		name="이름 없음";
//		age  = 1;
		
		
//		int i = 0 ;  오류
		this("이름없음",1);     // default 객체에 기본값 설정  
		int i = 0 ;   // 순서 중요 . this앞에는 statement도 올 수 없다.
	}
	
	public Person(String name, int age) {
		this.name =name;
		this.age = age;
	}
	
	// 자기 자신을 호출하는 Person()
	public Person returnSelf() {
		return this;
		
	}
}




public class CallAnotherCount {

	public static void main(String[] args) {
		
		
		Person p1 = new Person();
		System.out.println(p1.name + p1.age);
		
		
		System.out.println(p1.returnSelf(	));
	}

}
