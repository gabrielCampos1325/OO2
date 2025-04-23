package ar.edu.unlp.info.oo2.ejercicio4;

import java.time.Duration;

public class Pending extends State{
    @Override
    public void start() {
        super.item.setState(new InProgress());
    }

    public Duration workedTime(){
        throw new RuntimeException("La tarea aun no se inicio");
    };

}
