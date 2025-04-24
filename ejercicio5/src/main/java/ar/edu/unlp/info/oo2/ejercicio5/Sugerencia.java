package ar.edu.unlp.info.oo2.ejercicio5;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class Sugerencia {
	public List<Pelicula> sugerir(List<Pelicula> todas, List<Pelicula> vistas) {
		return todas.stream()
				.filter(this.getFilter(vistas)) //PREGUNTAR
				.sorted(this.getSort())
				.limit(3)
				.collect(Collectors.toList());
	}

	public abstract Predicate<Pelicula> getFilter(List<Pelicula> vistas);

	public abstract Comparator<Pelicula> getSort();
	
}
