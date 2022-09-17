
public class Main {

	public static void main(String[] args) {
		Gamer memo = new Gamer(203, "Mehmet", "ARI", "11223366554", "CrazyBoi" ) ; 
		GamerValidator validator = new GamerValidator() ; 
		validator.validator(memo.nationalitiyId.length());
		
		Gamer nuroli = new Gamer(100,"nur","uys", "1356451", "FuckinMoron") ; 
		validator.validator(nuroli.nationalitiyId.length());
		
		
		Campaign kampania  = new Campaign("Kampanya1", "null", "null2") ; 
		System.out.println(nuroli.firstname + " Size Özel Kampanya " + kampania.campaignName); 
		
				
	}

}
