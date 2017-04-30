package pattern.observable;
import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {
	private int code;
	private String nom;
	
	public Client(int code, String nom){
		this.code = code;
		this.nom = nom;
	}

	@Override
	public void update(Observable o, Object arg) {

		Produit pr = (Produit)o;
		System.out.println("le client "+nom+" a été notifié que le produit "+pr.getId()+" a le prix " + pr.getPrixUnitaire());
		
	}
}
