package ar.edu.unlp.info.oo2.ejercicio2;

import java.util.*;

import org.junit.jupiter.api.*;

public class EmpleadoTest {
	
	List<Empleado> listaEmpleados;
	
	@BeforeEach
	void setUp() throws Exception {
		listaEmpleados = new ArrayList<Empleado>();
		listaEmpleados.add(new Temporario(40, true, 2));
	    listaEmpleados.add(new Pasante(3));
	    listaEmpleados.add(new Planta(true, 2, 15));
	}
	
	@Test
	public void testImprimirSueldos() {
		this.listaEmpleados.stream()
					  	   .forEach(e -> e.imprimirSueldo());
	}
	
	@Test
	public void testGetSueldo() {
		Assertions.assertEquals(36390.0, listaEmpleados.get(0).getSueldo());
        Assertions.assertEquals(23100.0, listaEmpleados.get(1).getSueldo());
        Assertions.assertEquals(80550.0, listaEmpleados.get(2).getSueldo());
	}
	
}
