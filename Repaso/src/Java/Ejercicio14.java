package Java;

import java.util.Scanner;

public class Ejercicio14 {
	/*Implementar una función que recibe dos enteros de 8 dígitos con el formato aaaammdd,
	 *  informar cuál de las dos es la anterior y cuál la posterior.
	 *   Usar lo aplicado en el ejercicio 5. 
*/
	//funciones
	static void ordenFecha(){
		
		int anioMenor=0,anioMayor=0, mesMenor=0,mesMayor=0,diaMenor=0,diaMayor=0;
		
		 Scanner d = new Scanner(System.in);
			
			System.out.println("Ingrese un numero de 8 digitos que represente una fecha aaaammdd :  ");
			int fecha = d.nextInt();
			
			System.out.println("Ingrese otro numero de 8 digitos que represente una fecha aaaammdd :  ");
			int fecha2 = d.nextInt();
			
			
			
			int anio = fecha / 10000;
			int anio2 = fecha2 / 10000;
			
			
			
			int mes = fecha / 100 % 100 ;
			int mes2 = fecha2 / 100 % 100 ;
			
			int dia = fecha %100;
			int dia2 = fecha2 %100;
			
			anioMenor=anio;
			if(anio2<anioMenor){
				anioMenor=anio2;
				anioMayor=anio;
			}
			else {
				anioMenor=anio;
				anioMayor=anio2;
			
			}
			

			mesMenor=mes;
			if(mes2<mesMenor){
				mesMenor=mes2;
				mesMayor=mes;
			}
			else {
				mesMenor=mes;
				mesMayor=mes2;
			}
			
			diaMenor=mes;
			if(dia2<diaMenor){
				diaMenor=dia2;
				diaMayor=dia;
			}
			else {
				diaMenor=dia;
				diaMayor=dia2;
			}
			
			
			System.out.println("La fecha ordenada anterior es: " + diaMenor + "/" + mesMenor + "/" + anioMenor );
			    
			System.out.println("La fecha ordenada posterior es: " + diaMayor + "/" + mesMayor + "/" + anioMayor );
		
			
			
			
			
			
		
		
			
				
				
			
			
		
	}

	public static void main(String[] args) {
		/*Implementar una función que recibe dos enteros de 8 dígitos 
		con el formato aaaammdd, informar cuál de las dos es la anterior y cuál la posterior.
		Usar lo aplicado en el ejercicio 5.*/ 

       ordenFecha();
		
		
		
		
		
		

	}//fin main

}
