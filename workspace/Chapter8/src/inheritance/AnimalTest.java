package inheritance;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");	
	}
	public void readBook() {
		System.out.println("독서");
	}
	
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("사냥");
	}

	
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("비행");
	}

}


public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest(); 
		test.moveAnimal(new Human()); //사람이 두발로 걷습니다.
		test.moveAnimal(new Tiger()); //호랑이가 네발로 뜁니다.
		test.moveAnimal(new Eagle()); //독수리가 하늘을 납니다. 
		
//		Animal a = new Human();
//		
//		Animal[] animalList = new Animal[3];
//		animalList[0] = new Human();
//		
//		ArrayList<Animal> animals = new ArrayList<Animal>();
//		animals.add(new Tiger());
	}
	public void moveAnimal(Animal animal) {
		// 다형성 
		animal.move();
		// animal로 부를경우 Tiger의 hunting이 없음  
		
//		Human human = (Human)animal;
//		human.readBook();                            오류
		
		if(animal instanceof Human) {  // animal이 Human인 경우
			Human human = (Human)animal;
			human.readBook();
			
		}else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}else if(animal instanceof Eagle) {
			Eagle eager = (Eagle)animal;
			eager.flying();
		}else {
			System.out.println("지원되지 않는 동물이에요");
		}
		
		
		
	}

}
