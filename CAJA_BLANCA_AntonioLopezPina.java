package Examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CAJA_BLANCA_AntonioLopezPina {

	@Test
	public void testInstituto() {
		// este método comprueba que se realicen todos los resultados posibles de los
		// métodos de la clase instituto
		
		Instituto i = new Instituto(1);
		
		i.agregarDepartamento("departamento1", 1500);

		assertTrue(i.realizarPedido("departamento1", 1000));

		assertFalse(i.realizarPedido("departamento2", 2000));
	}

	@Test
	public void testDepartamento() {
		// este método comprueba que se realicen todos los resultados posibles de los
		// métodos de la clase departamento
		
		Departamento d = new Departamento("departamento1", 1500);
		
		assertTrue(d.procesarPedido(1000));

		assertFalse(d.procesarPedido(5000));
	}
	
}
