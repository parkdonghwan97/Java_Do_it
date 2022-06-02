package inheritance;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");	
	}
	public void readBook() {
		System.out.println("����");
	}
	
}
class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("���");
	}

	
}
class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("����");
	}

}


public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest(); 
		test.moveAnimal(new Human()); //����� �ι߷� �Ƚ��ϴ�.
		test.moveAnimal(new Tiger()); //ȣ���̰� �׹߷� �ݴϴ�.
		test.moveAnimal(new Eagle()); //�������� �ϴ��� ���ϴ�. 
		
//		Animal a = new Human();
//		
//		Animal[] animalList = new Animal[3];
//		animalList[0] = new Human();
//		
//		ArrayList<Animal> animals = new ArrayList<Animal>();
//		animals.add(new Tiger());
	}
	public void moveAnimal(Animal animal) {
		// ������ 
		animal.move();
		// animal�� �θ���� Tiger�� hunting�� ����  
		
//		Human human = (Human)animal;
//		human.readBook();                            ����
		
		if(animal instanceof Human) {  // animal�� Human�� ���
			Human human = (Human)animal;
			human.readBook();
			
		}else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}else if(animal instanceof Eagle) {
			Eagle eager = (Eagle)animal;
			eager.flying();
		}else {
			System.out.println("�������� �ʴ� �����̿���");
		}
		
		
		
	}

}
