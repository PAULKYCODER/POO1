package characterString;


import java.util.Scanner;

public class Ejercicio15 {

	//funciones
	static void esDigito(char ce) {
		
		if(ce == '0' || ce == '1' ||ce == '2' ||ce == '3' ||ce == '4' ||ce == '5' ||ce == '6' ||ce == '7' ||ce == '8' ||ce == '9'){
			
			System.out.println("El caracter es un numero");
		}
		
		else {
			System.out.println("El caracter es una letra");
		}
		
	}
	
	
	public static void main(String[] args) {
		/*Determinar si un carácter es un dígito numérico (función esDigito(char c)).*/

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un caracter: ");
		char c = sc.next().charAt(0);
		
		esDigito(c);
		

	}

}
