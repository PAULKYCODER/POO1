package desafios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculosTest {

	@Test
	void testInterseccionEntreCirculos() {
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		System.out.println(c1.intersectaCon(c2));
	}

}
