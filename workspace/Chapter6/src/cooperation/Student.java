package cooperation;
// ��ü�� �� ��

public class Student {
	
	String studentName;
	int grade;
	int money;
	
//	public Student() {
//	}
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money ;
		
	}
	
	
	public void takeBus(Bus bus) {  //������ ���� ������ �Ű�������
		bus.take(1000);
		money -= 1000;
	}
	public void takeSubway(Subway subway) {  //����ö�� ���� ������ �Ű�������
		subway.take(1500);
		money -= 1500;
	}
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
	
//	 ��� �� �߻� Ŭ���� ���� ���� �����
//	public void takeTrans(Trans trans) {
//		
//	}
	
	
	
}
