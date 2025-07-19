package mx.com.mundodafne.ms.pacientes.gmj.app;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.mundodafne.ms.pacientes.gmj.dao.PacienteRepository;
import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesInDTO;
import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesOutDTO;
import mx.com.mundodafne.ms.pacientes.gmj.entity.PerPacienteEntity;
import mx.com.mundodafne.ms.pacientes.gmj.entity.PerPersonaEntity;
import mx.com.mundodafne.ms.pacientes.gmj.exception.BusinessException;

@Service
public class GmjObtenerInfoPacientesAppImpl implements GmjObtenerInfoPacientesApp {

	@Autowired PacienteRepository pacienteRepo; 
	
	@Override
	public List<GmjBusquedaPacientesOutDTO> busquedaPacientesFiltro(GmjBusquedaPacientesInDTO in) throws BusinessException {
		List<GmjBusquedaPacientesOutDTO> out = null;
		GmjBusquedaPacientesOutDTO row;
		String tipoBusqueda = in.getTipoBusqueda();
		List<PerPacienteEntity> resultados = null;
		if("nombre".equalsIgnoreCase(tipoBusqueda)) {
			resultados = pacienteRepo.buscarPacientesPorNombre(in.getNombre());
			
		}
		
		if(tipoBusqueda.equalsIgnoreCase("folio" )) {
			out = new ArrayList();
			String regex = "\\d{10}-\\d";
			resultados = pacienteRepo.buscarPacientesPorFolio(in.getFolio());
			PerPersonaEntity persona;
			PerPacienteEntity paciente;
			for (PerPacienteEntity perPacienteEntity : resultados) {
				row = new GmjBusquedaPacientesOutDTO();
				persona = perPacienteEntity.getPerPersona();
				row.setNombres(persona.getNombrePropio1()+" "+persona.getNombrePropio2());
				row.setIdPaciente(persona.getIdPersona());
				row.setApellidoMaterno(persona.getApellidoMaterno());
				row.setApellidoPaterno(persona.getApellidoPaterno());
				row.setCurp(persona.getCurp());
				row.setFolio(perPacienteEntity.getFolio());
				row.setLocalidad(persona.getDomicilio().getLocalidad());
				Byte edad = Byte.valueOf(persona.getEdad().toString());
				row.setEdad(edad);
				out.add(row);
			}
			
			if(resultados == null || resultados.isEmpty() ) {
				throw new BusinessException("No se encontraron resultados");
			}
			return out;
			
//			if (!tipoBusqueda.matches(regex)) {
//				throw new BusinessException("Ingresar folios validos");
//			}
		}
		
//		if(in.getCurp() == null || in.getCurp().isEmpty()) {
//			throw new BusinessException("CURP del paciente vacia.");
//		}
		try {
			out = new ArrayList();
			List<PerPacienteEntity> res = (List) pacienteRepo.findAll();
			PerPersonaEntity persona;
			
			for (PerPacienteEntity perPacienteEntity : res) {
				row = new GmjBusquedaPacientesOutDTO();
				persona = perPacienteEntity.getPerPersona();
				row.setNombres(persona.getNombrePropio1()+" "+persona.getNombrePropio2());
				row.setIdPaciente(persona.getIdPersona());
				row.setApellidoMaterno(persona.getApellidoMaterno());
				row.setApellidoPaterno(persona.getApellidoPaterno());
				row.setCurp(persona.getCurp());
				row.setFolio(perPacienteEntity.getFolio());
				out.add(row);
			}
		} catch(Exception e) {
			throw new BusinessException(e.getMessage());
		}
		return out;
	}

}
