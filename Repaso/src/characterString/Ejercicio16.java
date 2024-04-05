package characterString;

import java.util.Scanner;

public class Ejercicio16 {
	static void esLetra(char ce) {

		if (ce != '0' || ce != '1' || ce != '2' || ce != '3' || ce != '4' || ce != '5' || ce != '6' || ce != '7'
				|| ce != '8' || ce != '9') {

			System.out.println("El caracter es una letra");
		}

		else {
			System.out.println("El caracter es un numero");
		}

	}

	public static void main(String[] args) {
		/* Determinar si un carácter es una letra (función esLetra(char c)). */
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un caracter: ");
		char c = sc.next().charAt(0);

		esLetra(c);

	}

}
