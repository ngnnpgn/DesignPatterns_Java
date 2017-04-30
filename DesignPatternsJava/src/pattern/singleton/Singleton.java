package pattern.singleton;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Singleton extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directeur D1 = Directeur.getInstance(1299, "Richard",3700);
		Directeur D2 = Directeur.getInstance(1249, "Ngnnpgn",7700);
		System.out.println("+++++++++++++++++++++++++Singleton++++++++++++++++++++++");
		System.out.println("");
		System.out.println("Comparaison sur les references:" + " "+ D1+ " = "+ D2);
		System.out.println("Comparaison des attributs de l'instance:" + D1.toInfo()+ " = "+ D2.toInfo());
		System.out.println("");
	    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	}

}
