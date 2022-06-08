package object;


class Student{
	int stuID;
	String stuName;
	
	public Student(int stuID,String stuName) {
		this.stuID=stuID;
		this.stuName=stuName;
	}

	@Override
	public boolean equals(Object obj) { //객체가 Object로 넘어온다. 재정의를 위해 다운캐스팅
		
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
		
		
		System.out.println(str1 == str2);   // str1과 str2의 주소가 같은지? =>  false
		System.out.println(str1.equals(str2)); // str1과 str2의 문자열이 같은지? => true

		
		
		Student stu1 = new Student(1001, "Tomas");				
		Student stu2 = new Student(1001, "Tomas");
		
		System.out.println(stu1==stu2);
		System.out.println(stu1.equals(stu2)); //true

		// hashcode
		System.out.println(stu1.hashCode()); //21119912242111991224 => hashCode 재정의 후 1001
		System.out.println(System.identityHashCode(stu1)); //21119912242111991224
		System.out.println(stu2.hashCode()); //292938459 => hashCode 재정의 후 1001
		System.out.println(System.identityHashCode(stu2));//292938459
		
		System.out.println(str1.hashCode()); //2571410      str은 hash코드가 재정의 되어 있기 때문에 두 str1 str2값의 hashcode가 같다
		System.out.println(str2.hashCode()); //2571410
		
		System.out.println(System.identityHashCode(str1)); //917142466
		System.out.println(System.identityHashCode(str2)); //1993134103
		
		
		
	}
}
