package herencia;

import java.util.Iterator;

public class Herencia {

	public static void main(String[] args) {
		/*Empleado e1 = new Empleado();
		
		e1.getLegajo();
		e1.getNombre();
		
		Consultor c1 = new Consultor();*/
		
		/*CREO UN VECTOR TIPO STRING
		String vector[] = new String[3];
		salta error poque nopúedo mezclar tipos de datos
		//vector[0] = 2;*/
		
		//POLIMORFISMO NOS PERMITE MEZCLAR TIPOS DE DATOS EN UN ARRAYS
		// CREO VECTOR TIPO PERSONA
		Persona [] vector = new Persona[5];
		vector [0] = new Persona();	
		vector [1] = new Empleado();
		vector [2] = new Consultor();
		vector [3] = new Jefe();
		
		//INTERACTUAR ENTRE OBJETOS ES POSIBLE CON EL POLIMORFISMO
	
		
		
		for (int i = 0; i < vector.length -1; i++) {
			vector[i].setNombre("Pablo");
		}
		
		for (int i = 0; i < vector.length -1; i++) {
			System.out.println(vector[i].getNombre());
		}
		
		System.out.println("------------------------------");
	
		System.out.println(vector[0].getNombre());
		

	}

}
