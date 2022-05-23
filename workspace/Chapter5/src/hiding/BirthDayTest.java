package hiding;

class BirthDay {

	private int year;  // 클래스 안에서만 사용할 수 있는 접근 제어자 private
	private int month;
	private int day;
	
	
	// 
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	
	public int getDay() {
		
		return day;
	}
	
	
	public void setDay(int day) {
		if(month == 2) {
			if (day<1 || day>28) {
				System.out.println("날짜 오류 ");
			}	
		}
		else {
			
			this.day = day;
		}
	}
	
	
	
}

public class BirthDayTest{
	public static void main(String[] args) {
		BirthDay day =new BirthDay();
//		day.year = 2021;
//		day.month = 2;
//		day.day = 30;
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2022);
	}
}
