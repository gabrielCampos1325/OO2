package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter extends VoorheesExporter{
	
	@Override
	public String exportar(List<Socio> socios) {
		ObjectMapper mapper = new ObjectMapper();
		
        try {
            return mapper.writeValueAsString(socios);
        } catch (Exception e) {
            throw new RuntimeException("Error al convertir a JSON", e);
        }
	}
	
}
