package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.*;

public class JSONSimpleAdapter extends VoorheesExporter{
	
	@SuppressWarnings("unchecked")
	@Override
	public String exportar(List<Socio> socios) {
		JSONArray jsonList = new JSONArray();
		
		socios.stream()
			  .forEach(s -> jsonList.add(this.crearJsonObject(s)));
		
		return jsonList.toJSONString();		
	}
	
	@SuppressWarnings("unchecked")
	private JSONObject crearJsonObject(Socio s) {
		JSONObject obj = new JSONObject();
		
		obj.put("nombre", s.getNombre());
		obj.put("email", s.getEmail());
		obj.put("legajo", s.getLegajo());
		
		return obj;		
	}
}
