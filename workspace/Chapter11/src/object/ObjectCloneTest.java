package object;


class Point{
	int x;
	int y;


	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "X= "+x+ ", y= "+y; 
	}
}


class Circle implements Cloneable{
	Point point;
	private int radius;
	
	public Circle(int x,int y,int radius) {
		point = new Point(x,y);
		this.radius=radius;
	}
	public String toString() {
		return "원점 : "+this.point + " 반지름 : "+this.radius;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle = new Circle(10,20,5);
		Circle cloneCircle = (Circle)circle.clone();
		
		System.out.println(System.identityHashCode(circle)); //292938459
		System.out.println(System.identityHashCode(cloneCircle)); //917142466
		
		System.out.println(circle); 	// 원점 : X= 10, y= 20 반지름 : 5
		System.out.println(cloneCircle);// 원점 : X= 10, y= 20 반지름 : 5
		
		
		
		
	}

}
