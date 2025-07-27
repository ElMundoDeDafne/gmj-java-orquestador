package mx.com.mundodafne.ms.pacientes.gmj.app;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
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
	
	private List<GmjBusquedaPacientesOutDTO> obtenerResultados(List<PerPacienteEntity> resultados){
		List<GmjBusquedaPacientesOutDTO> res = new ArrayList();
		PerPersonaEntity persona;
		PerPacienteEntity paciente;
		GmjBusquedaPacientesOutDTO row;
		Iterator itRes = resultados.iterator();
		while(itRes.hasNext()) {
			row = new GmjBusquedaPacientesOutDTO();
			paciente = (PerPacienteEntity) itRes.next();
			persona = paciente.getPerPersona();
			row.setNombres(persona.getNombrePropio1()+" "+persona.getNombrePropio2());
			row.setIdPaciente(persona.getIdPersona());
			row.setApellidoMaterno(persona.getApellidoMaterno());
			row.setApellidoPaterno(persona.getApellidoPaterno());
			row.setCurp(persona.getCurp());
			row.setFolio(paciente.getFolio());
			row.setLocalidad(persona.getDomicilio().getLocalidad());
			Byte edad = Byte.valueOf(persona.getEdad().toString());
			row.setEdad(edad);
			res.add(row);
		}
		return res;
	} 
	
	@Override
	public List<GmjBusquedaPacientesOutDTO> busquedaPacientesFiltro(GmjBusquedaPacientesInDTO in) throws BusinessException {
		List<GmjBusquedaPacientesOutDTO> out = null;		
		String tipoBusqueda = in.getTipoBusqueda();
		List<PerPacienteEntity> resultados = null;
		if("nombreS".equalsIgnoreCase(tipoBusqueda)) {
			resultados = pacienteRepo.buscarPacientesPorNombre(in.getNombre());
			out = obtenerResultados(resultados);
		}
		
		if("folio".equalsIgnoreCase(tipoBusqueda)) {
			resultados = pacienteRepo.buscarPacientesPorFolio(in.getFolio());
			out = obtenerResultados(resultados);
		}
		
		return out;
	}

}
