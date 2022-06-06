package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("고수 : 빠르게 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("고수 : 높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("고수 : 한바퀴 돕니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("### 고수 ###");
	}

}
