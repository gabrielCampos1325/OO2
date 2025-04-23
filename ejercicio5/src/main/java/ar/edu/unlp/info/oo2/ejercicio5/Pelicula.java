package ar.edu.unlp.info.oo2.ejercicio5;

import java.util.List;

public class Pelicula {
	private String titulo;
	private int anio;
	private double puntaje;
	private List<Pelicula> similares;



	public Pelicula(String titulo, double puntaje, int anio ) {
		this.titulo = titulo;
		this.anio = anio;
		this.puntaje = puntaje;
	}	
	
	public void setSimilitud(Pelicula pelicula) {
		this.similares.add(pelicula);
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public int getAnio() {
		return this.anio;
	}

	public double getPuntaje() {
		return this.puntaje;
	}
}
