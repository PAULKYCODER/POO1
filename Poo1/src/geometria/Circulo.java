package geometria;

public class Circulo {
	
	private double radio;
	
	

	//constructor
	public Circulo(double radio) {
		
		this.radio = radio;
	}
	
	//Metodos
	public double obtenerRadio() {
		return radio;
	}
	
	public void cambiarRadio(double nuevoRadio) {
		radio = nuevoRadio;
	}
	
	public double obtenerDiametro() {
		return radio * 2;
	}
	
	public double obtenerPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double obtenerArea() {
		return Math.PI * radio*radio;
	}
	
	
	
	
}
