package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		
		
		Player player = new Player();
		player.play(1);
//		### 초보자 ###
//		초보자 : 천천히 달립니다
//		초보자 : jump 못함
//		초보자 : turn 못함
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
//		### 중수 ###
//		중수 : 빠르게 달립니다
//		중수 : 높이 점프합니다.
//		중수 : 높이 점프합니다.
//		중수 : turn 못함
		
		SuperLevel sLevel  = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
//		### 고수 ###
//		고수 : 빠르게 달립니다
//		고수 : 높이 점프합니다.
//		고수 : 높이 점프합니다.
//		고수 : 높이 점프합니다.
//		고수 : 한바퀴 돕니다.

		
		
	}

}
