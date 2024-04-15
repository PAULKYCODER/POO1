package logica;

public class Poo {

	public static void main(String[] args) {
		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno(5, "Pablo", "Reyes");
		

		System.out.println("La ID del alumno 2 es: "+ a2.getId());
		System.out.println("El nombre es: " + a2.getNombre());
		System.out.println("El apellido es: " + a2.getApellido());
		
		a1.setId(3);
		a1.setNombre("Sebastian");
		a1.setApellido("Reyes");
		

		System.out.println("---------------------------------------------------------");
		System.out.println("La ID del alumno 2 es: "+ a1.getId());
		System.out.println("El nombre es: " + a1.getNombre());
		System.out.println("El apellido es: " + a1.getApellido());
		System.out.println("---------------------------------------------------------");

		//cambiar  id alumno 2
		
		a2.setId(35);
		System.out.println("La ID del alumno 2 es: "+ a2.getId());
		System.out.println("El nombre es: " + a2.getNombre());
		System.out.println("El apellido es: " + a2.getApellido());
		
		System.out.println("---------------------------------------------------------");
		
		
		
	}

}
