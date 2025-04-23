package ar.edu.unlp.info.oo2.ejercicio5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class DecodificadorTest {
	
	private Decodificador decodificador;

	private Pelicula thor;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rocky;
	private Pelicula rambo;
	
	
	@BeforeAll
	public void setUp() {

		thor = new Pelicula("Thor", 7.9, 2007);
		capitanAmerica = new Pelicula("Capitan America", 7.8, 2016);
		ironMan = new Pelicula("Iron man", 7.9, 2010);
		dunkirk = new Pelicula("Dunkirk", 7.9, 2017);
		rocky = new Pelicula("Rocky", 8.1, 1976);
		rambo = new Pelicula("Iron man", 7.8, 1979);

		thor.setSimilitud(capitanAmerica);
		thor.setSimilitud(ironMan);

		capitanAmerica.setSimilitud(thor);
		capitanAmerica.setSimilitud(ironMan);

		ironMan.setSimilitud(thor);
		ironMan.setSimilitud(capitanAmerica);

		rocky.setSimilitud(rambo);
		
		rambo.setSimilitud(rocky);
		
		List<Pelicula> grilla = new ArrayList<>(Arrays.asList(thor, capitanAmerica, ironMan, dunkirk, rocky, rambo));
		decodificador = new Decodificador(grilla);

	}
	
    @Test
    public void testSugerenciaSimilaridad() {
    	this.decodificador.setSugerencia(new Similaridad());   
    	List<Pelicula> listResult = this.decodificador.sugerirPeliculas();
        assertEquals("Capitan America", listResult.get(0));
    	assertEquals("Iron man", listResult.get(1));
    	assertEquals("Rambo", listResult.get(2));
    }
    
    @Test
    public void testSugerenciaPuntaje() {
    	this.decodificador.setSugerencia(new Puntaje());    	
    	List<Pelicula> listResult = this.decodificador.sugerirPeliculas();
        assertEquals("Dunkirk", listResult.get(0));
        assertEquals("Iron man", listResult.get(1));
        assertEquals("Capitan America", listResult.get(2));
    }
}
