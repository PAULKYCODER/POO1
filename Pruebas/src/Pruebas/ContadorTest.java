package Pruebas;
/*PARA QUE FUNCIONE EL TEST HAY QUE HACER LO SIGUIENTE:
 *-IR A PROPIEDADES DEL PROYECTO
 *-IR A LIBRERIAS
 *-EN LA SECCION CLASSPATH AGREGAR LIBRERIA JUnit y la version que elija
 *-LUEGO AGREGAR UNA JUnit CLASS CASE PONERLE NOMBRE DE CLASS+TEST
 *-A CONTINUACION PROBAR EL CÓDIGO
 **/


import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorTest {

	@Test
	public void creacion() {
		//CONSTRUCTOR
		Contador c = new Contador();
		
		assertNotNull(c);
	}
	
	
	@Test
	public void quePuedeContar() {
		//CONSTRUCTOR
		Contador c = new Contador();
		
		//Act
		c.contar();

		//Assert
		assertEquals(1 , c.mostrar());
		
		//Annihilate (no es necesario)
		c = null;
		
		
	}
		
		
		

}
