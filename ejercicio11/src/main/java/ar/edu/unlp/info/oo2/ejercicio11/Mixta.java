package ar.edu.unlp.info.oo2.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia {
	
	private List<Topografia> listaTopografias;
	
	public Mixta() {
		this.listaTopografias = new ArrayList<Topografia>();
	}
	
	public void agregarTopografia(Topografia topografia) {
		this.listaTopografias.add(topografia);		
	}
	
	@Override
	public double getProporcion() {
		return this.listaTopografias.stream()
				.mapToDouble(t -> t.getProporcion())
				.average()
				.orElse(1);
	}

	public List<Topografia> getListaTopografias() {
		return this.listaTopografias;
	}

	@Override
	public boolean comparar(Topografia topografia) {
		// TODO Auto-generated method stub
		return false;
		// doble dispatch
	}
	
}
