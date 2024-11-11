import java.time.LocalDate;
import java.time.LocalDateTime;

public class Movimientos {

	private LocalDateTime fechahora;
	private String detalle;
	public Movimientos(LocalDateTime fechahora, String detalle) {
		super();
		this.fechahora = fechahora;
		this.detalle = detalle;
	}
	public LocalDateTime getFechahora() {
		return fechahora;
	}
	public void setFechahora(LocalDateTime fechahora) {
		this.fechahora = fechahora;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	
	
	
	
}
