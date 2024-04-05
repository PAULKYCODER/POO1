package geometria;

public class App {

	public static void main(String[] args) {

		//creé un objeto circulo con radio 2
		Circulo circulito = new Circulo(2);

		System.out.println(circulito.obtenerRadio());
		System.out.println("cambie el  radio");
		circulito.cambiarRadio(4);
		System.out.println("radio");
		System.out.println(circulito.obtenerRadio());
		System.out.println("diametro");
		System.out.println(circulito.obtenerDiametro());
		System.out.println("perimetro");
		System.out.println(circulito.obtenerPerimetro());
		System.out.println("area");
		System.out.println(circulito.obtenerArea());
		
		
		
		
		
		

		
	

	}

}
