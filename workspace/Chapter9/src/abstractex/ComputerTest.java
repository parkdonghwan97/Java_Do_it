package abstractex;

public class ComputerTest {
	
	public static void main(String[] args) {
//		Computer c1 = new Computer();  �߻�Ŭ������ �ν��Ͻ�ȭ �ɼ� ����.
//		c1.disply();
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();  �߻�Ŭ������ �ν��Ͻ�ȭ �ɼ� ����.
		Computer c4 = new MyNoteBook();
		NoteBook c5 = new MyNoteBook();
		
		
		c2.display() ;// DeskTop display()
		c4.typing(); //MyNoteBook typing

//		c4.aaa(); X
//		c5.aaa(); O 
	}

}
