package Java;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*Determinar el menor valor de un conjunto de números e indicar 
		 también su posición relativa dentro del mismo.}
		 *  El ingreso de datos finaliza con la llegada de un cero.*/
        
		int pos=0, nmenor=0;  
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int num = sc.nextInt();
		
		while(num != 0) {
			
			
			
			
			if(pos==0) {
				nmenor=num;
				pos++;
			}
			else {
				
				if(num<nmenor) {
					nmenor=num;
					
				}
				pos++;
				
					
			}
			
			
			
			
			System.out.println("Ingrese un numero: ");
			num = sc.nextInt();
			
			
			
		}//fin bucle
		
		System.out.println("El numero menor del conjunto es " + nmenor + " y la posicion del numero es " + pos);
		

	}//fin main

}