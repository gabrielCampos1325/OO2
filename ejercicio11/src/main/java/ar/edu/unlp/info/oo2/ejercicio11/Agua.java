package ar.edu.unlp.info.oo2.ejercicio11;

public class Agua extends Topografia {

	@Override
	public double getProporcion() {
		return 1;
	}
	
	public boolean comparar(Topografia topografia) {
		return topografia.getProporcion() == 1 ? true : false;
	}
	
}
