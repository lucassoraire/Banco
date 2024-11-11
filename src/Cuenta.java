import java.util.LinkedList;

public class Cuenta {

	private int Nrocuenta;
	private double saldo;
	private String tarjeta;
	private LinkedList<String> movimientos;
	public Cuenta(int nrocuenta, double saldo, String tarjeta, LinkedList<String> movimientos) {
		super();
		Nrocuenta = nrocuenta;
		this.saldo = saldo;
		this.tarjeta = tarjeta;
		this.movimientos = movimientos;
	}
	public int getNrocuenta() {
		return Nrocuenta;
	}
	public void setNrocuenta(int nrocuenta) {
		Nrocuenta = nrocuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}
	public LinkedList<String> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(LinkedList<String> movimientos) {
		this.movimientos = movimientos;
	}
	
	
	
	
	
}
