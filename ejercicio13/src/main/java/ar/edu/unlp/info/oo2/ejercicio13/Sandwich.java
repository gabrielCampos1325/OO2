package ar.edu.unlp.info.oo2.ejercicio13;

public class Sandwich {
	
	private double pan;
	private double aderezo;
	private double principal;
	private double adicional;
	
	public void setPan(double pan) {
		this.pan = pan;		
	}

	public void setAderezo(double aderezo) {
		this.aderezo = aderezo;		
	}

	public void setPrincipal(double principal) {
		this.principal = principal;		
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;		
	}

	public double getCosto() {
		return this.pan + this.aderezo + 
			   this.principal + this.adicional;
	}
	
}
