package clasesabstractas;

public abstract class Figura {

	protected double x;
	protected double y;

	public Figura() {

	}

	public Figura(double x, double y) {

		this.x = x;
		this.y = y;
	}

	// METODO ABSTRACTO

	public abstract double calcularArea();

}
