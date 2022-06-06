package gamelevel;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("중수 : 빠르게 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("중수 : 높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("중수 : turn 못함");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("### 중수 ###");
	}

}
