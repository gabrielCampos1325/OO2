package ar.edu.unlp.info.oo2.ejercicio2;

public abstract class Empleado {
	
	protected double basico;
	
	protected Empleado(double basico) {
		this.basico = basico;
	}
	
	public double getSueldo() {
		return sueldoBasico() +
			   sueldoAdicional() -
			   descuento();
	}
	
	public double sueldoBasico() {
		return this.basico;
	}
	
	public double descuento() {
		return this.sueldoBasico() * 0.13 +
			   this.sueldoAdicional() * 0.05;
	}
	
	public abstract double sueldoAdicional();
	
	public void imprimirSueldo() {
		System.out.println("El sueldo es: " + this.getSueldo());
	}
		
}
