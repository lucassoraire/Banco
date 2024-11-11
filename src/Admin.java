import java.util.LinkedList;

public class Admin extends Usuario {

	private int Nroadmin;

	public Admin(String nombre, String dni, String contrasena, LinkedList<String> usuarios, int nroadmin) {
		super(nombre, dni, contrasena, usuarios);
		Nroadmin = nroadmin;
	}

	public int getNroadmin() {
		return Nroadmin;
	}

	public void setNroadmin(int nroadmin) {
		Nroadmin = nroadmin;
	}
	
		
	
	
}
