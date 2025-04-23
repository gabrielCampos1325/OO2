package ar.edu.unlp.info.oo2.ejercicio4;

public class Paused extends State{
    public void togglePause(){
        super.item.setState(new InProgress());
    };

    public void finish(){
        super.item.setState(new Finished());
    };

    public void addComment(String comment) {
        super.item.getCommentariesList().add(comment);
    }

}
