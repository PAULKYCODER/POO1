package desafios;

/*Desafío Círculos
1. Para construir un círculo se requiere un punto, que será su centro, y un radio.
Nuestro pequeño programa nos permitirá verificar si hay o no intersección entre dos círculos.
Se te pide programar las clases Punto, Circulo,
y una prueba que te permita verificar el correcto funcionamiento del método especificado.

Ejemplo de funcionamiento:

Circulo c1 = new Circulo(new Punto(0, 0), 1);
Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
System.out.println(c1.intersectaCon(c2)); // true*/

public class Circulo {
	
	private double radio;
	
	

	//constructor
	public Circulo(double x, double y, double radio) {
		
		this.setRadio(radio);
		
		
	}
	
	//Metodos
	public void setRadio(double radio) {
		if(radio <= 0 ) {
			throw new Error("Radio inválido");
		}
		this.radio = radio;
	}
	
}
	

	
	
	
	

