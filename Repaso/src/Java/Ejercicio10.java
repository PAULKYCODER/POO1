package Java;


import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*Se ingresa un valor numérico por consola,
		  determinar e informar si se trata de un número primo o no.  */
         
		int suma=0;
		
		Scanner d = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		int num = d.nextInt();
		
		for (int i = 1; i < num; i++) {
			
			int aux = num%i;
			System.out.println(aux);
			
			if(aux == 0) {
				
				suma=suma+1;
			}
		}
		
		if(suma <= 2) {
			System.out.println("El numero es primo");
		}
		else {
			System.out.println("El numero no es primo");
		}
			
			
		

	}//fin main

	
	
}
