package gamelevel;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	
	final public void go(int count) { //여러 동작이 담긴 템플릿 메서드
		run();
		
		
		
		for(int i=0; i<count;i++) {   // 레벨만큼 점프
			jump();
		}
		turn();
	}
	
	
}
