package Java;

import java.util.Scanner;



public class Ejercicio12 {

	public static void main(String[] args) {
		/*Dado un conjunto de valores numéricos indicar cuál es el mayor.
		 * El ingreso de datos finaliza con la llegada de un cero.*/
		int nmayor=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int num = sc.nextInt();
		
		while(num != 0) {
			
			nmayor = num;
			
			if(num>nmayor) {
				
				nmayor=num;
			}
			
			System.out.println("Ingrese un numero: ");
			num = sc.nextInt();
			
			
			
			
			
		}//fin bucle
		System.out.println("El numero mayor es " + nmayor);
		
		 
		 
	}//fin main

}
