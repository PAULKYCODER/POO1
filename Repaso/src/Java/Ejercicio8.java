package Java;

import java.util.Scanner;

public class Ejercicio8 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Desarrollar una función que muestre por pantalla los primeros n números naturales 
		 * considerando al 0 (cero) como primer número natural,
		 *  siendo n un valor que se pasa por parámetro.
        */
		
		Scanner d = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int n = d.nextInt();
		
		numNat(n);
			
		

	}
	
	static void numNat (int n){
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Numero natural " + i);
			
		} 
	}

}


