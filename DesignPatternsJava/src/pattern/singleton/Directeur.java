package pattern.singleton;

public class Directeur {
	
	private int numero;
	private String nom;
	private double salaire;
	private static Directeur  inst;
	private Directeur(int  numero, String nom, double salaire){
		this.numero = numero;
		this.nom = nom;
		this.salaire = salaire;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	/**
	 * @
	 * @param numero
	 * @param nom
	 * @param salaire
	 * @return
	 */
	public static Directeur getInstance(int numero, String nom, int salaire){
		if (inst ==  null)
			inst =  new Directeur(numero, nom, salaire);
		return inst;
	}
	

	public String toInfo() {
		return numero+ "  " + nom + "  " + salaire;
	}

}
