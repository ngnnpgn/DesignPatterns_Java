package pattern.observable;

public class Main_Observable {

	public static void main(String[] args) {
		
		    Client cl1=new Client(1, "madani");
	        Client cl2=new Client(2, "errahmouni");
	        Produit pr=new Produit(1,"stylo", 1.5);
	        pr.addObserver(cl1);
	        pr.addObserver(cl2);
	        pr.Changer(2);
	}

}
