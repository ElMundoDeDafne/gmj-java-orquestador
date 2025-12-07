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
		Byte edad;
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
			row.setFechaUltimaVisita(paciente.getFechaUltimaVisita());
			row.setEspecialidad("ESP. EJEMPLO");
			row.setMedicoTratante("DR. FULANITO");
			edad = Byte.valueOf(persona.getEdad().toString());
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
		
		switch(tipoBusqueda) {
			case "nombres":
				resultados = pacienteRepo.buscarPacientesPorNombre(in.getNombre());
				out = obtenerResultados(resultados);				
				break;
			case "folio":
				resultados = pacienteRepo.buscarPacientesPorFolio(in.getFolio());
				out = obtenerResultados(resultados);				
				break;
			case "curp":
				resultados = pacienteRepo.buscarPacientesPorCURP(in.getCurp());
				out = obtenerResultados(resultados);
				break;
			case "especialidad":
//				resultados = pacienteRepo.buscarPacientesPorFolio(in.getFolio());
//				out = obtenerResultados(resultados);
				out = new ArrayList();
				break;
			case "medicotratante":
				out = new ArrayList();
				break;
			case "localidad":
				out = obtenerResultados(pacienteRepo.buscarPacientesPorLocalidad(in.getLocalidad()));
				break;
			default: //aqui se va a hacer la busqueda de todos los registros
				out = obtenerResultados(pacienteRepo.findAll());
				break;
		}
		
		if(out.isEmpty()){
			throw new BusinessException("No se encontraron resultados");
		}
		
		return out;
	}

}
