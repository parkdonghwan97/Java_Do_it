package cooperation;
// 객체의 협 업

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
	
	
	public void takeBus(Bus bus) {  //버스에 관한 정보를 매개변수로
		bus.take(1000);
		money -= 1000;
	}
	public void takeSubway(Subway subway) {  //지하철에 관한 정보를 매개변수로
		subway.take(1500);
		money -= 1500;
	}
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
	
//	 상속 및 추상 클래스 배우면 이해 쉬울듯
//	public void takeTrans(Trans trans) {
//		
//	}
	
	
	
}
