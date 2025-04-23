package ar.edu.unlp.info.oo2.ejercicio13;

public class SandwichClasicoDirector {
	
	public Sandwich construir(SandwichClasicoBuilder builder) {
		builder.crearSandwich();
		builder.componentePan();
		builder.componenteAderezo();
		builder.componentePrincipal();
		builder.componenteAdicional();
		return builder.terminarSandwich();
	}
	
}
