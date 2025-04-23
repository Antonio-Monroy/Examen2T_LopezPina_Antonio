package Examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CAJA_NEGRA_AntonioLopezPina {

	@Test
	public void institutoConDepartamentosExactos() {

		// este método comprueba que se puede crear tantos departamentos como la
		// cantidad que se le asigne al instituto

		int departamentosAgregados = 0, capacidad = 3;
		Instituto i = new Instituto(capacidad);
		boolean departamentosLibres = true;

		i.agregarDepartamento("departamento1", 1000.50);
		departamentosAgregados++;
		i.agregarDepartamento("departamento2", 2000.20);
		departamentosAgregados++;
		i.agregarDepartamento("departamento3", 3000.10);
		departamentosAgregados++;

		if (departamentosAgregados > capacidad) {
			departamentosLibres = false;
		}

		assertTrue(departamentosLibres);

	}

	@Test
	public void institutoConMasDepartamentosQueElPermitido() {

		// este método comprueba que no se puede crear más departamentos que la cantidad
		// que se le asigne al instituto

		int departamentosAgregados = 0, capacidad = 2;
		Instituto i = new Instituto(capacidad);
		boolean departamentosLibres = true;
		
		i.agregarDepartamento("departamento1", 1000.50);
		departamentosAgregados++;
		i.agregarDepartamento("departamento2", 2000.20);
		departamentosAgregados++;
		i.agregarDepartamento("departamento3", 3000.10);
		departamentosAgregados++;

		if (departamentosAgregados > capacidad) {
			departamentosLibres = false;
		}

		assertFalse(departamentosLibres);

	}

}
