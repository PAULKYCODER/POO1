package herencia;

public class Empleado extends Persona{

	private int legajo;
	private String cargo;
	private double sueldo;
	
	public Empleado() {
		
	}
	
	public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int legajo,
			String cargo, double sueldo) {
		//SUPER los trae heredados los atributos
		super(id, dni, nombre, apellido, domicilio, telefono);
		this.legajo = legajo;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
	
	
	
	
}
