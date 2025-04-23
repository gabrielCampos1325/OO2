package ar.edu.unlp.info.oo2.ejercicio11;

public class Tierra extends Topografia {

	@Override
	public double getProporcion() {
		return 0;
	}
	
	public boolean comparar(Topografia topografia) {
		return topografia.getProporcion() == 0 ? true : false;
	}

}
