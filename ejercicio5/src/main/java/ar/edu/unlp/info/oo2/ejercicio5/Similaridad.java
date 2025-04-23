package ar.edu.unlp.info.oo2.ejercicio5;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Similaridad extends Sugerencia {
    @Override
    public Predicate<Pelicula> getFilter(List<Pelicula> vistas){
        return p -> !vistas.contains(p);
    }
    @Override
    public Comparator<Pelicula> getSort(){
        return (p1, p2) -> Integer.compare(p2.getAnio(), p1.getAnio());
    }

}
