package gamelevel;

public class Player {

	private PlayerLevel level;

	public PlayerLevel getLevel() {
		return level;
	}

//	public void setLevel(PlayerLevel level) {
//		this.level = level;
//	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
		
	}
	
	
	// »ý¼ºÀÚ
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
}
