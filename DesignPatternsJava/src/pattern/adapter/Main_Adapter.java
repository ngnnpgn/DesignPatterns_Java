package pattern.adapter;

public class Main_Adapter {

	public static void main(String[] args) {
		
		Adapter A = new Adapter(1,"Will Smith", 10000);
        System.out.println("fist name: "+A.getFirstName()); 
        System.out.println("last name: "+A.getLastName());
        System.out.println("salaire en dollar: "+A.getSalary());

	}

}
