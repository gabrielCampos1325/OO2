package ar.edu.unlp.info.oo2.ejercicio2;

public class Planta extends Empleado {
	
	private boolean casado;
	private int hijos;
	private int antiguedad;
	
	public Planta(boolean casado, int hijos, int antiguedad) {
		super(50000.0);
		this.casado = casado;
		this.hijos = hijos;
		this.antiguedad = antiguedad;
	}
	
	public double sueldoAdicional() {
		return (casado ? 5000.0 : 0.0) + 
			   this.hijos * 2000.0 + 
			   this.antiguedad * 2000.0;
	}
	
}
