package thisEx;


class Person{
	
	String name;
	int age;
	
	public Person() {
//		name="�̸� ����";
//		age  = 1;
		
		
//		int i = 0 ;  ����
		this("�̸�����",1);     // default ��ü�� �⺻�� ����  
		int i = 0 ;   // ���� �߿� . this�տ��� statement�� �� �� ����.
	}
	
	public Person(String name, int age) {
		this.name =name;
		this.age = age;
	}
	
	// �ڱ� �ڽ��� ȣ���ϴ� Person()
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
