package ar.edu.unlp.info.oo2.ejercicio12;

import java.time.LocalDate;
import java.util.List;

public class Archivo extends ElementoNavegable{

    private int tamanio;

    public Archivo(String nombre, LocalDate fechaCreacion, int tamanio) {
        super(nombre, fechaCreacion);
        this.tamanio = tamanio;
    }

    @Override
    public int getTamanio() {
        return this.tamanio;
    }

    public LocalDate getFechaCreacion() {
        return super.fechaCreacion;
    }

    @Override
    public Archivo getArchivoMasGrande() {
        return this;
    }

    @Override
    public Archivo getArchivoMasNuevo() {
        return this;
    }

    @Override
    public ElementoNavegable buscar(String nombre) {
        return this.getNombre().equals(nombre) ? this : null;
    }

    @Override
    public List<ElementoNavegable> buscarTodos(String nombre) {
        return this.getNombre().equals(nombre) ? List.of(this) : List.of();
    }

}
