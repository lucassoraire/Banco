import java.util.LinkedList;

public class Usuario {

	private String nombre;
	private String dni;
	private String contrasena;
	private LinkedList<String> usuarios;
	public Usuario(String nombre, String dni, String contrasena, LinkedList<String> usuarios) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.contrasena = contrasena;
		this.usuarios = usuarios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public LinkedList<String> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(LinkedList<String> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void Login (String nombre, String contraseña) {
		
		
		
	}
	
	
}
