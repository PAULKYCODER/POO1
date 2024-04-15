package logica;

public class Alumno {

	//ATRIBUTOS O CARACTERISTICAS
	private int id;
	private String nombre;
	private String apellido;
	
	
	
	
	//CONSTRUCTOR VACIO
	public Alumno() {
		
	}
	
	

	//CONSTRUCTOR CON PARAMETROS
	public Alumno(int id, String nombre, String apellido) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	



	
	
	//GETTER(OBTENER) & SETTER(
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}





	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	

	//METODOS
	public void mostrarNombre(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		
		System.out.println("Hola, soy un alumno y se decir mi nombre");
	}
	
	public void saberAprobado(double calificacion) {
		if(calificacion >= 6) {
			System.out.println("Aprobado");
		}
		else
			System.out.println("Desaprobe");
	}
	
	
	
	
	
}
