package abstractex;

public class ComputerTest {
	
	public static void main(String[] args) {
//		Computer c1 = new Computer();  추상클래스는 인스턴스화 될수 없다.
//		c1.disply();
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();  추상클래스는 인스턴스화 될수 없다.
		Computer c4 = new MyNoteBook();
		NoteBook c5 = new MyNoteBook();
		
		
		c2.display() ;// DeskTop display()
		c4.typing(); //MyNoteBook typing

//		c4.aaa(); X
//		c5.aaa(); O 
	}

}
