import java.util.LinkedList;

public class Cliente extends Usuario {

	private String tipo;

	public Cliente(String nombre, String dni, String contrasena, LinkedList<String> usuarios, String tipo) {
		super(nombre, dni, contrasena, usuarios);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	
}
