package herencia;

public class Consultor extends Persona {

	private String nombreConsultora;
	
	private int numConsultora;

	public Consultor() {
		
		
	}

	public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
			String nombreConsultora, int numConsultora) {
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.nombreConsultora = nombreConsultora;
		this.numConsultora = numConsultora;
	}

	public String getNombreConsultora() {
		return nombreConsultora;
	}

	public void setNombreConsultora(String nombreConsultora) {
		this.nombreConsultora = nombreConsultora;
	}

	public int getNumConsultora() {
		return numConsultora;
	}

	public void setNumConsultora(int numConsultora) {
		this.numConsultora = numConsultora;
	}
	
	

	
	
	
	
	
	
	
	
}
