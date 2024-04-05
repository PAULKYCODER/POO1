package Nota;

public class Nota {

	//tipo de dato privado
	private int valor;
	
	//constructor
	Nota(int valor){
		this.valor = valor;
	}
	
	//METODOS
	public boolean estaAprobado() {
		return (valor>=4 && valor <= 10);
			
	}

	public boolean estaDesaprobado() {
		return !estaAprobado();
	}

	public int obtenerValorNota() {

		return valor;
	}

	public boolean promociona() {

		return valor >= 7;
	}

	public void recupera(int nuevoValor) {
		if(nuevoValor > valor) {
			valor=nuevoValor;
		}

	}

	public static void main(String[] args) {

		Nota parcial1 = new Nota(3);
		Nota parcial2 = new Nota(7);
		Nota juana = new Nota(10);
		
		System.out.println(parcial1.estaAprobado());
		System.out.println(parcial2.estaAprobado());
		System.out.println(parcial1.estaDesaprobado());
		System.out.println(parcial2.estaDesaprobado());
		System.out.println(juana.estaAprobado());
		System.out.println(juana.obtenerValorNota());
		
		parcial1.recupera(6);
		System.out.println(parcial1.estaAprobado());
		System.out.println(parcial1.obtenerValorNota());
		
		System.out.println(parcial1.promociona());
	

	}

}
