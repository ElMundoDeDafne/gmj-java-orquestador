package mx.com.mundodafne.ms.pacientes.gmj.app;

import java.time.LocalDateTime;
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
		String tipoBusqueda = in.getTipoBusqueda(); 
		if(tipoBusqueda.equalsIgnoreCase("folio" )) {
			String regex = "\\d{10}-\\d";
			if (!tipoBusqueda.matches(regex)) {
				throw new BusinessException("Ingresar folios validos");
			}
		}
		
//		if(in.getCurp() == null || in.getCurp().isEmpty()) {
//			throw new BusinessException("CURP del paciente vacia.");
//		}
		try {
			out = new ArrayList();
			for(int i = 0; i < 10 ; i++) {
				row = new GmjBusquedaPacientesOutDTO();
				row.setNombres("CHRISTIAN YAMIL");
				row.setApellidoPaterno("CASTILLO");
				row.setCurp("CACC910212A50");
				row.setLocalidad("JACALA");
				row.setApellidoMaterno("COVARRUBIAS");
				row.setEdad((byte)31);
				row.setEspecialidad("NEUROLOGIA");
				row.setMedicoTratante("GERARDO A. BORBOLLA");
				row.setFechaUltimaVisita(LocalDateTime.now());
				row.setFolio("33654-1");
				row.setIdPaciente(11L);				
				out.add(row);
			}
		} catch(Exception e) {
			throw new BusinessException(e.getMessage());
		}
		return out;
	}

}
