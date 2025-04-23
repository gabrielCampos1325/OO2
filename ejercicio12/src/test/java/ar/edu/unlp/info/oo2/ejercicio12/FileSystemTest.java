package ar.edu.unlp.info.oo2.ejercicio12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class FileSystemTest {

    private Archivo archivo;
    private Directorio directorio;

    @BeforeEach
    void setUp() {
        archivo = new Archivo("facultad", LocalDate.of(2023, 10, 10), 13);
        directorio = new Directorio("facultad", LocalDate.of(2020, 04, 16));
        directorio.agregarElemento(archivo);
	}

    @Test
    void TestTamanioTotalOcupado() {
        assertEquals(13 + 32, directorio.getTamanio());
    }

    @Test
    void TestArchivoMasGrande() {
        assertEquals(13, directorio.getArchivoMasGrande().getTamanio());
    }

    @Test
    void TestArchivoMasNuevo() {
        assertEquals(archivo.getFechaCreacion(), directorio.getArchivoMasNuevo().getFechaCreacion());
    }

    @Test
    void TestBuscar() {
        assertEquals(directorio.getNombre(), directorio.buscar("facultad").getNombre());
    }

    @Test
    void TestBuscarTodos() {
        assertEquals(2, directorio.buscarTodos("facultad").size());
    }

    @Test
    void TestListadoDeContenido() {
        System.out.println(directorio.listadoDeContenido());
    }

}
