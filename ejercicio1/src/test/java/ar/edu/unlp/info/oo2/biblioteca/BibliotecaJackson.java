package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaJackson {

	private Biblioteca biblioteca;
	
	@BeforeEach
	public void setUp() throws Exception{	
		biblioteca = new Biblioteca();
		
		JacksonAdapter jsonSimple = new JacksonAdapter();
		biblioteca.setExporter(jsonSimple);
		
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}
	
	
	@Test
	public void testExportarSocios() {
		System.out.println(biblioteca.exportarSocios());
	}

}
