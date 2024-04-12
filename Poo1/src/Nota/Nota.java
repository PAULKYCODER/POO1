package Nota;

public class Nota {

	//tipo de dato privado
	private int valorNota;
	
	//constructor
	public Nota(int valorInicial){
		this.valorNota = valorInicial;
	}
	
	//METODOS
	public int obtenerValorNota() {
		return this.valorNota;

	}
	
	public boolean estaAprobado() {
		return (valorNota>=4 && valorNota <= 10);
			
	}

	public boolean estaDesaprobado() {
		return !estaAprobado();
	}

	

	public boolean promociona() {

		return valorNota >= 7;
	}

	public void recupera(int nuevoValor) {
		if(nuevoValor > valorNota) {
			valorNota=nuevoValor;
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
