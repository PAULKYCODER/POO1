package logica;

public class Encapsulamiento {

	public static void main(String[] args) {
		// JUGANDO CON MODIFICADORES DE ACCESO
		// constructores publicos
		Alumno a5 = new Alumno();
		Alumno a6 = new Alumno(15, "Valentina", "Reyes");

		System.out.println("Id: " + a6.getId());
		System.out.println("Nombre: " + a6.getNombre());
		System.out.println("Apellido: " + a6.getApellido());
		// constructores privados

	}

}
