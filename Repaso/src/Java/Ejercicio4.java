package Java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dado un valor numérico entero, informar si es par o impar.
		
		
		
		Scanner d = new Scanner(System.in) ;
		
		System.out.println("Ingrese un numero: ");
		int n = d.nextInt();
		
		
		
		if(n % 2 == 0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
			
		d.close();
		
		
		
		
		
		
		
		

	}

}
