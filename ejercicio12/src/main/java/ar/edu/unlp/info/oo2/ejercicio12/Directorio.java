package ar.edu.unlp.info.oo2.ejercicio12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends ElementoNavegable{
    private List<ElementoNavegable> listaElementos;

    public Directorio(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.listaElementos = new ArrayList<ElementoNavegable>();
    }

    public void agregarElemento(Archivo archivo) {
        this.listaElementos.add(archivo);
    }

    @Override
    public int getTamanio() {
        return 32 + this.listaElementos.stream()
                .mapToInt(e -> e.getTamanio())
                .sum();
    }

    public LocalDate getFechaCreacion() { // preguntar
        return null;
    }

    @Override
    public Archivo getArchivoMasGrande() {
        return this.listaElementos.stream()
                .map(e -> e.getArchivoMasGrande())
                .max((a, b) -> Integer.compare(a.getTamanio(), b.getTamanio()))
                .orElse(null);
    }

    @Override
    public Archivo getArchivoMasNuevo() {
        return this.listaElementos.stream()
                .map(e -> e.getArchivoMasNuevo())
                .max((a, b) -> a.getFechaCreacion().compareTo(b.getFechaCreacion()))
                .orElse(null);
    }

    @Override
    public ElementoNavegable buscar(String nombre) {
        if (this.nombre.equals(nombre)) {
            return this;
        }
        return this.listaElementos.stream()
                .map(e -> e.buscar(nombre))
                .filter(e -> e != null)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<ElementoNavegable> buscarTodos(String nombre) {
        List<ElementoNavegable> resultados = new ArrayList<>();

        if (this.getNombre().equals(nombre)) {
            resultados.add(this);
        }

        return this.listaElementos.stream()
                .flatMap(e -> e.buscarTodos(nombre).stream())
                .collect(Collectors.toCollection(() -> resultados));
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String listadoDeContenido() {
        String aux = "/" + this.getNombre();

        String contenido = this.listaElementos.stream()
                .map(e -> aux + e.listadoDeContenido())
                .collect(Collectors.joining(""));

        return aux + "\n" + contenido;
    }

}
