package ar.edu.unlp.info.oo2.ejercicio4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    private String name;
    private State state;
    private List<String> commentariesList;
    private LocalDate horaInicio;
    private LocalDate horaFin;

/**
* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
*/
    public ToDoItem(String name){
        this.name = name;
        this.state = new Pending();
        this.commentariesList =  new ArrayList<String>();
        this.state.setToDoItem(this);
    }
/**
 * Establece un estado.
 */
    public void setState(State state){
        this.state = state;
    }

/**
* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
* pending. Si se encuentra en otro estado, no hace nada.
*/
    public void start(){
        this.horaInicio = LocalDate.now();
        this.state.start();
    }

/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo.
*/
    public void togglePause(){
        this.state.togglePause();
    }

/**
* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
* in-progress o paused. Si se encuentra en otro estado, no hace nada.
*/
    public void finish(){
        this.state.finish();
        this.horaFin = LocalDate.now();
    }

/**
* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
* genera un error informando la causa específica del mismo.
*/
    public Duration workedTime(){
        return Duration.between(this.horaInicio, this.horaFin); //PREGUNTAR
    }


/**
* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
* contrario no hace nada."
*/
    public void addComment(String comment){
        this.state.addComment(comment); //PREGUNTAR
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getHoraInicio() {
            return this.horaInicio;
    }

    public LocalDate getHoraFin() {
            return this.horaFin;
    }

    public List<String> getCommentariesList() {
        return this.commentariesList;
    }
}