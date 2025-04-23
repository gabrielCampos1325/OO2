package ar.edu.unlp.info.oo2.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class TopografiaTest {
	
	@BeforeEach
	void setUp() throws Exception {
		
	}
	
    @Test
    public void testTopografiaSoloAgua() {
    	Topografia agua = new Agua();
        assertEquals(1, agua.getProporcion());
    }
    
    @Test
    public void testTopografiaSoloTierra() {
    	Topografia tierra = new Tierra();
        assertEquals(0, tierra.getProporcion());
    }
    
    @Test
    public void testTopografiaMixta() {
    	Mixta mixta = new Mixta();
    	mixta.agregarTopografia(new Tierra());
    	mixta.agregarTopografia(new Agua());
    	mixta.agregarTopografia(new Tierra());
    	mixta.agregarTopografia(new Agua());
    	
        assertEquals(0.5, mixta.getProporcion());
    }
    
    @Test
    public void testTopografiaMixta2() {
    	Mixta mixta = new Mixta();
    	mixta.agregarTopografia(new Tierra());
    	mixta.agregarTopografia(new Agua());
    	mixta.agregarTopografia(new Tierra());
    	
    	Mixta mixta2 = new Mixta();
    	mixta2.agregarTopografia(new Tierra());
    	mixta2.agregarTopografia(new Agua());
    	mixta2.agregarTopografia(new Tierra());
    	mixta2.agregarTopografia(new Agua());
    	mixta.agregarTopografia(mixta2);
    	
        assertEquals(0.375, mixta.getProporcion());
    }
    
    
}
