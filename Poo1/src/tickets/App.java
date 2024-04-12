package tickets;

public class App {

	public static void main(String[] args) {
		Ticket t1 = new Ticket(0);
		t1.agregarItem(3, 3000);
		System.out.println(t1.calcularSubtotal());
		t1.agregarItem(2, 7590);
		t1.calcularSubtotal();
		

	}

}
