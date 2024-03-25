package Java;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leer tres valores numéricos enteros, indicar cual es el mayor,
		cuál es el del medio y cuál el menor. Considerar que los tres valores son diferentes.
        */
		
		int menor=0, medio = 0, mayor=0 ;
		
		int a = 3;
		int b = 10;
		int c = 50;
		
		if((a>b)&& (b>c)) {
			mayor=a;
		}
		else
		
		if(b>c) {
			medio=b;
			menor=c;
		}
		else {
			medio=c;
			menor=b;
		}
		
		
		
		
		System.out.println("El mayor es: " + mayor + " El del medio es: " + medio + " El menor es: " + menor);

	}

}
