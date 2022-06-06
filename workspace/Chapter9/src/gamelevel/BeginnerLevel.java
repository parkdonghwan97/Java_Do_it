package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("초보자 : 천천히 달립니다");
	}

	@Override
	public void jump() {
		System.out.println("초보자 : jump 못함");
	}

	@Override
	public void turn() {
		System.out.println("초보자 : turn 못함");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("### 초보자 ###");
	}

}
