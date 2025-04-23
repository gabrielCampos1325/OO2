package ar.edu.unlp.info.oo2.ejercicio13;

public class SandwichClasicoBuilder implements SandwichBuilder{
	
	private Sandwich clasico;
	
	@Override
	public void crearSandwich() {
		this.clasico = new Sandwich();
	}
	
	public void componentePan() {
		this.clasico.setPan(100.0);		
	}
	
	public void componenteAderezo() {
		this.clasico.setAderezo(20.0);				
	}
	
	public void componentePrincipal() {
		this.clasico.setPrincipal(300.0);				
	}
	
	public void componenteAdicional() {
		this.clasico.setAdicional(80.0);				
	}
	
	@Override
	public Sandwich terminarSandwich() {
		return this.clasico;
	}	
	
}
