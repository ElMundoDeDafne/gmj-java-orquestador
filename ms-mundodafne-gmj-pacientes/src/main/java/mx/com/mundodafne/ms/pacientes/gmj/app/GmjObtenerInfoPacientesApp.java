package mx.com.mundodafne.ms.pacientes.gmj.app;

import java.util.List;

import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesInDTO;
import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesOutDTO;
import mx.com.mundodafne.ms.pacientes.gmj.exception.BusinessException;

public interface GmjObtenerInfoPacientesApp {
	List<GmjBusquedaPacientesOutDTO> busquedaPacientesFiltro(GmjBusquedaPacientesInDTO in) throws BusinessException;
}
