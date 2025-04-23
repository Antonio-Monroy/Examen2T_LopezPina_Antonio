package Examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class INTEGRACION_AntonioLopezPina {

	@Test
	public void validarPedido() {
		//este método valida un pedido que sea correcto
		double monto = 100.50;

		Departamento d = new Departamento("departamento1", 1500);

		assertTrue(d.procesarPedido(monto));

	}

	@Test
	public void cancelarPedidoPorFaltaDePresupuesto() {
		//este método comprueba que no se puede realizar el pedido ya que el monto es mayor al presupuesto
		double monto = 1000.20;

		Departamento d = new Departamento("departamento1", 150);

		assertFalse(d.procesarPedido(monto));

	}

}
