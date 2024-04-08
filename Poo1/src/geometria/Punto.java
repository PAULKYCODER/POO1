package geometria;

/*Implementar la clase Punto. 
 * Un Punto en el plano posee coordenada X y coordenada Y. 
 * Proporcionar métodos para:
obtener y cambiar cada una de sus coordenadas:
public double obtenerX()
public double obtenerY()
public void cambiarX(double nuevoX)
public void cambiarY(double nuevoY)

saber si el punto está sobre el eje de las X:
public boolean estaSobreEjeX()

saber si el punto está sobre el eje de las Y:
public boolean estaSobreEjeY()

saber si el punto es el origen de coordenadas:
public boolean esElOrigen()
*/

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
	
	public void mover(double enX, double enY) {
		this.x += enX;
		this.y += enY;
	}
	
	public void cambiarX(double nuevoX){
		this.x = nuevoX;
	}
	
	public void cambiarY(double nuevoY) {
		this.y = nuevoY;
	}
	
	public boolean estaSobreEjeX() {
		return (y == 0);
		
	}
	
	public boolean estaSobreEjeY() {
		return (x == 0);
	}
	
	public boolean esElOrigen() {
		return (x == 0 && y ==0);
	}
	
	
}
