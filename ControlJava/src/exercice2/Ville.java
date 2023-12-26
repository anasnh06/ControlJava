package exercice2;


public class Ville implements Comparable<Ville>, Cloneable {
	
	
	private String nom;
	private int superficie, nbHabitant;
	
	

	public Ville(String nom, int superficie) {
		this.nom = nom;
		this.superficie = superficie;
	}



	public Ville(String nom, int superficie, int nbHabitant) {
		this.nom = nom;
		this.superficie = superficie;
		this.nbHabitant = nbHabitant;
	}


	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", superficie=" + superficie + ", nbHabitant=" + nbHabitant + "]";
	}



	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return this.nom.compareTo(o.nom);
	}
	
	@Override
	public Ville clone() throws CloneNotSupportedException
	{
		return (Ville)super.clone();
	}

}
