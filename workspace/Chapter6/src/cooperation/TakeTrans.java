package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
	
		Student KIM = new Student("KIM",5000); 
		Student LEE = new Student("LEE",10000); 
		
		Bus bus100 = new Bus(100); // 100¹ø ¹ö½º
		KIM.showInfo();
		bus100.showInfo();
		
		KIM.takeBus(bus100); //
		
		KIM.showInfo();
		bus100.showInfo();
		
		
		Subway subway2 = new Subway(2);
		LEE.showInfo();
		subway2.showInfo();
		
		LEE.takeSubway(subway2);
		
		LEE.showInfo();
		subway2.showInfo();
		
	}

}
