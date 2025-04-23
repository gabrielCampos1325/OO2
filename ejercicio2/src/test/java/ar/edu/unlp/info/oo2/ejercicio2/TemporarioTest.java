package ar.edu.unlp.info.oo2.ejercicio2;

import java.util.*;

import org.junit.jupiter.api.*;

public class TemporarioTest {
	
	Empleado gabriel = new Temporario(40, true, 2);
	Empleado luca = new Temporario(40, true, 2);
	Empleado alejandro = new Temporario(40, true, 2);
	/*
	@BeforeEach
	void setUp() throws Exception {
		Empleado gabriel = new Temporario(40, true, 2);
		Empleado luca = new Temporario(40, true, 2);
		Empleado alejandro = new Temporario(40, true, 2);
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
	*/
}
