package ar.edu.unlp.info.oo2.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;

public abstract class State {
    protected ToDoItem item;

    public void setToDoItem(ToDoItem item){
        this.item = item;
    }

    public void start(){};

    public void togglePause(){
        throw new RuntimeException("La tarea no se encuentra en pause o in-progress");
    };

    public void finish(){};

    public Duration workedTime(){
        return Duration.between(this.item.getHoraInicio(), LocalDate.now());
    };

    public void addComment(String comment) {
        throw new RuntimeException("No se puede agregar un comentario porque la tarea no se encuentra iniciada");
    }

}
