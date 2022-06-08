package object;


class Student{
	int stuID;
	String stuName;
	
	public Student(int stuID,String stuName) {
		this.stuID=stuID;
		this.stuName=stuName;
	}

	@Override
	public boolean equals(Object obj) { //��ü�� Object�� �Ѿ�´�. �����Ǹ� ���� �ٿ�ĳ����
		
		if( obj instanceof Student) {
			Student std =(Student)obj;
			if(stuID ==std.stuID) {
				return true;
			}else {
				return false;
			}
		}

		
		return false;
	}
	
	public int hashCode() {
		return stuID;
	}
}


public class EqualsTest {
	public static void main(String[] args) {

		String str1 = new String("TEST");
		String str2 = new String("TEST");
		
		
		System.out.println(str1 == str2);   // str1�� str2�� �ּҰ� ������? =>  false
		System.out.println(str1.equals(str2)); // str1�� str2�� ���ڿ��� ������? => true

		
		
		Student stu1 = new Student(1001, "Tomas");				
		Student stu2 = new Student(1001, "Tomas");
		
		System.out.println(stu1==stu2);
		System.out.println(stu1.equals(stu2)); //true

		// hashcode
		System.out.println(stu1.hashCode()); //21119912242111991224 => hashCode ������ �� 1001
		System.out.println(System.identityHashCode(stu1)); //21119912242111991224
		System.out.println(stu2.hashCode()); //292938459 => hashCode ������ �� 1001
		System.out.println(System.identityHashCode(stu2));//292938459
		
		System.out.println(str1.hashCode()); //2571410      str�� hash�ڵ尡 ������ �Ǿ� �ֱ� ������ �� str1 str2���� hashcode�� ����
		System.out.println(str2.hashCode()); //2571410
		
		System.out.println(System.identityHashCode(str1)); //917142466
		System.out.println(System.identityHashCode(str2)); //1993134103
		
		
		
	}
}
