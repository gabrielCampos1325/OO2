package ar.edu.unlp.info.oo2.ejercicio5;

import java.util.*;

public class Decodificador {
	
	 private List<Pelicula> grilla;
	 private List<Pelicula> vistas;

	 private Sugerencia sugerencia;
	 
	 public Decodificador(List<Pelicula> grilla) {
		 this.grilla = grilla;
		 this.vistas = new ArrayList<Pelicula>();
	 }
	 
	 public void setSugerencia(Sugerencia sugerencia) {
		 this.sugerencia = sugerencia;
	 }
	 
	 public List<Pelicula> sugerirPeliculas() {
		 return this.sugerencia.sugerir(grilla, vistas);
	 }
	 
}
