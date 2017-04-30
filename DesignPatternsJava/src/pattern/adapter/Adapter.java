package pattern.adapter;

public class Adapter extends Employe implements Employable {

	public Adapter(int id, String nom, double salaire) {
		super(id, nom, salaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalary() {
		return (getSalaire()*1.2);
	}

	@Override
	public String getFirstName() {
		
		String nom = getNom();
		int pos = nom.indexOf(" ");
		return nom.substring(0, pos);
	}

	@Override
	public String getLastName() {
		
		String nom = getNom();
		int pos = nom.indexOf(" ");
		return nom.substring(pos+1);
	}

}
