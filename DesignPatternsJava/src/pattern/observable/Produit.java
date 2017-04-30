package pattern.observable;

import java.util.Observable;

public class Produit extends Observable {
	
	private int id;
	private String nom;
	private double prixUnitaire;
	
	public Produit(int id, String nom, double prixUnitaire) {
		this.id = id;
		this.nom = nom;
		this.prixUnitaire = prixUnitaire;
	}
	public int getId() {
		return id;
	}
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	
	public void Changer(double prixUnitaire){
		
		this.prixUnitaire = prixUnitaire;
		setChanged();
		notifyObservers();
	}
	
	
}
