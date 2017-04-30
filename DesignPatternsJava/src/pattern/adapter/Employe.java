package pattern.adapter;

/**
 * 
 * @author ngnkm
 *
 */

public class Employe {
	
	@SuppressWarnings("unused")
	private int id;
	private String nom;
	private double salaire;
	
	
	public Employe(int id, String nom, double salaire) {
		this.id = id;
		this.nom = nom;
		this.salaire = salaire;
	}
	
	public String getNom() {
		return nom;
	}
	
	public double getSalaire() {
		return salaire;
	}


}
