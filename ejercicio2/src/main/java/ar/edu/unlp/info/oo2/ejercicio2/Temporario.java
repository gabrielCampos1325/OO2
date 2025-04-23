package ar.edu.unlp.info.oo2.ejercicio2;

public class Temporario extends Empleado {
	
	private int horasTrabajadas;
	private boolean casado;
	private int hijos;
	

	public Temporario(int horasTrabajadas, boolean casado, int hijos) {
		super(20000.0);
		this.horasTrabajadas = horasTrabajadas;
		this.casado = casado;
		this.hijos = hijos;
	}
	
	public double sueldoBasico() {
		return super.basico + 
			   this.horasTrabajadas * 300;
	}
	
	public double sueldoAdicional() {
		return (casado ? 5000.0 : 0.0) + this.hijos * 2000.0;
	}
		
}
