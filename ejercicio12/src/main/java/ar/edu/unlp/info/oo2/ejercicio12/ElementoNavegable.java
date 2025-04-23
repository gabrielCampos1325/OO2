package ar.edu.unlp.info.oo2.ejercicio12;

import java.time.LocalDate;
import java.util.List;

public abstract class ElementoNavegable {

    protected String nombre;
    protected LocalDate fechaCreacion;

    public ElementoNavegable(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public abstract int getTamanio();

    public abstract Archivo getArchivoMasGrande();

    public abstract Archivo getArchivoMasNuevo();

    public String getNombre(){
        return this.nombre;
    }

    public abstract ElementoNavegable buscar(String nombre);

    public abstract List<ElementoNavegable> buscarTodos(String nombre);

    public String listadoDeContenido() {
        return "/" + this.getNombre() + "\n";
    }

}
