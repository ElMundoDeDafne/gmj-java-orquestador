package mx.com.mundodafne.ms.pacientes.gmj.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesInDTO;
import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesOutDTO;
import mx.com.mundodafne.ms.pacientes.gmj.exception.BusinessException;

@Service
public class GmjObtenerInfoPacientesAppImpl implements GmjObtenerInfoPacientesApp {

	@Override
	public List<GmjBusquedaPacientesOutDTO> busquedaPacientesFiltro(GmjBusquedaPacientesInDTO in) throws BusinessException {
		List<GmjBusquedaPacientesOutDTO> out = null;
		GmjBusquedaPacientesOutDTO row;
		if(in.getCurp() == null || in.getCurp().isEmpty()) {
			throw new BusinessException("CURP del paciente vacia.");
		}
		try {
			row = new GmjBusquedaPacientesOutDTO();
			row.setNombres("CHRISTIAN YAMIL");
			row.setApellidoPaterno("CASTILLO");
			row.setCurp("CACC910212A50");
			row.setLocalidad("JACALA");
		} catch(Exception e) {
			throw new BusinessException(e.getMessage());
		}
		out = new ArrayList();
		out.add(row);
		return out;
	}

}
