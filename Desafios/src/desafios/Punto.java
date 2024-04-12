package desafios;


public class Punto {

	//ATRIBUTOS
	private double  x;
	private double y;
	
	
	
	//CONSTRUCTOR
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//METODOS
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public void punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
}