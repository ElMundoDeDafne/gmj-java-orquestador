package mx.com.mundodafne.ms.personal.gmj.app;

import java.util.List;

import mx.com.mundodafne.ms.personal.gmj.entity.PerPersonaEntity;
import mx.com.mundodafne.ms.personal.gmj.entity.PerPersonalEntity;

public interface ConsultaPersonalApp {
	List<PerPersonalEntity> obtenerTodoElPersonal();
	PerPersonalEntity obtenerPersonalPorId(Long idPersonal);
	List<PerPersonalEntity> obtenerPersonalPorCodigo(String codigo);
	
}
