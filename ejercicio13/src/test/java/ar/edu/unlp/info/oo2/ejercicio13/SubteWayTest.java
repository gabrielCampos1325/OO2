package ar.edu.unlp.info.oo2.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class SubteWayTest {

	/*
	private SandwichVegetarianoBuilder builderVegetariano;
	private SandwichVeganoBuilder builderVegano;
	private SandwichSinTACCBuilder builderSinTAAC;
	*/
	
	@BeforeEach
	void setUp() throws Exception {
		
	}
	
    @Test
    public void testBuildSandwichClasico() {
    	SandwichClasicoBuilder builderClasico = new SandwichClasicoBuilder();
    	SandwichClasicoDirector director = new SandwichClasicoDirector();
    	Sandwich sandwichClasico = director.construir(builderClasico);
    	assertEquals(500.0, sandwichClasico.getCosto());
    }
    
}
