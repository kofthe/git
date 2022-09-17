
public abstract class BaseGamerManager implements GamerService{

	@Override
	public void save(Gamer gamer) {
		System.out.println("Gamer Kaydedildi" + gamer.getFirstname()); 
		
		
	} 
	
	

}
