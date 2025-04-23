package ar.edu.unlp.info.oo2.ejercicio2;

public class Pasante extends Empleado {

	private int examenesRendidos;

	public Pasante(int examenesRendidos) {
		super(20000.0);
		this.examenesRendidos = examenesRendidos;
	}
	
	public double sueldoAdicional() {
		return this.examenesRendidos * 2000.0;
	}
	
}
