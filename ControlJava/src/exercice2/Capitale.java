package exercice2;

public class Capitale extends Ville {
	
	private String pays;

	public Capitale(String pays, String nom, int superficie) {
		super(nom, superficie);
		this.pays=pays;
	}

	public Capitale(String pays, String nom, int superficie, int nbHabitant) {
		super(nom, superficie, nbHabitant);
		this.pays=pays;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() +"est capital de : "+pays;
	}

	@Override
	public Capitale clone() throws CloneNotSupportedException
	{
		return (Capitale)super.clone();
	}
	

}
