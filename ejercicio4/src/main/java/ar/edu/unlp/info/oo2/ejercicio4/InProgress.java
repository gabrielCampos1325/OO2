package ar.edu.unlp.info.oo2.ejercicio4;

public class InProgress extends State{
    public void togglePause(){
        super.item.setState(new Paused());
    };

    public void finish(){
        super.item.setState(new Finished());
    };

    public void addComment(String comment) {
        super.item.getCommentariesList().add(comment);
    }

}
