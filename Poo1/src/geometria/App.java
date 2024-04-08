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
		
		
		//PUNTO
		Punto p1 = new Punto(3,6);
		
		System.out.println(p1);
		
		p1.cambiarX(8);
		p1.cambiarY(0);
		System.out.println(p1);
		System.out.println(p1.estaSobreEjeX()); 
		System.out.println(p1.estaSobreEjeY());
		System.out.println(p1.esElOrigen());
	
		
		
		
		
		
		
		

		
	

	}

}
