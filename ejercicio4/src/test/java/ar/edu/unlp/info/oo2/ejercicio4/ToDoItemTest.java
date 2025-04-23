package ar.edu.unlp.info.oo2.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class ToDoItemTest {
	
	private ToDoItem tarea;
	
	@BeforeEach
	void setUp() throws Exception {
        String name = "Reparar pc";
		tarea = new ToDoItem(name);
	}

    @Test
    public void testCreateToDoItem() {

    }
	
    @Test
    public void testSetStatusToInProgress() {

    }
    
    @Test
    public void testSetStatusToPaused() {
    	
    }
    
    @Test
    public void testSetStatusToFinish() {
    	
    }
    
    @Test
    public void testGetWorkedTime() {
    	
    }
    
    @Test
    public void testAddComment() {
    	
    }
}
