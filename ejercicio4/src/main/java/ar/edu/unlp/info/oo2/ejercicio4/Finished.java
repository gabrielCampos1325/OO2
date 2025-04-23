package ar.edu.unlp.info.oo2.ejercicio4;

import java.time.Duration;

public class Finished extends State{
    public void togglePause(){
        super.item.setState(new Paused());
    };

    @Override
    public Duration workedTime(){
        return Duration.between(super.item.getHoraInicio(), super.item.getHoraFin());
    }

}
