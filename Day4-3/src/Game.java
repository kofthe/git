
public class Game {
	String gameName;
	String gameAge ; 
	String gamePrice ;  
	int gameId;
	
	public Game(String gameName, String gameAge, String gamePrice, int gameId) {
		super();
		this.gameName = gameName;
		this.gameAge = gameAge;
		this.gamePrice = gamePrice;
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameAge() {
		return gameAge;
	}

	public void setGameAge(String gameAge) {
		this.gameAge = gameAge;
	}

	public String getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(String gamePrice) {
		this.gamePrice = gamePrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	} 
	
	
}
