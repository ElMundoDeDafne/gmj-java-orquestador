package mx.com.mundodafne.gmj.hoja.frontal.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDatosContactoPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDomicilioPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHojaFrontalDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjInformacionPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjNESignosVitales;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjRequestFrontalDTO;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerDatosContacto;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerDomicilio;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerPaciente;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerPersona;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerSignosVitales;
import mx.com.mundodafne.gmj.hoja.frontal.exception.BusinessException;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjDatosContactoPacienteRepository;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjDomicilioPacienteRepository;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjPacienteRepository;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjPersonaRepository;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjSignosVitalesRepository;

@Service
public class GmjRegistrarPacientesAppImpl implements GmjRegistrarPacienteApp {

	@Autowired GmjPersonaRepository personaRepository;
	@Autowired GmjDomicilioPacienteRepository domiRepository;
	@Autowired GmjDatosContactoPacienteRepository contactoRepository;
	@Autowired GmjPacienteRepository pacienteRepository;
	@Autowired GmjSignosVitalesRepository signosRepository;
	
	@Override
	public boolean registroPaciente(GmjHojaFrontalDTO requestFrontalDTO) throws BusinessException {
		// TODO Auto-generated method stub
		PerPersona persona;
		PerDomicilio domicilioPersona;
		PerDatosContacto datosContactoPersona;
		PerPaciente paciente;
		PerSignosVitales signosVitales;
		
		GmjInformacionPacienteDTO infoPaciente;
		GmjDomicilioPacienteDTO domiPaciente;
		GmjDatosContactoPacienteDTO datosContactoPaciente;
		GmjNESignosVitales signos;
		List<PerPersona> busqueda;
		
		boolean exito = false;
		/**
		 * mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDatosContactoPacienteDTO@7d9ffd3c
mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDomicilioPacienteDTO@3e8f247f
mx.com.mundodafne.gmj.hoja.frontal.dto.GmjInformacionPacienteDTO@30e1dd06
		 * */
		try {
			signos = new GmjNESignosVitales();
			persona = new PerPersona();
			domicilioPersona = new PerDomicilio();
			datosContactoPersona = new PerDatosContacto();
			signosVitales = new PerSignosVitales();
	        OffsetDateTime offsetDateTime;
			paciente = new PerPaciente();
			infoPaciente = requestFrontalDTO.getInformacionPx();
			domiPaciente = requestFrontalDTO.getDomicilioPaciente();
			datosContactoPaciente = requestFrontalDTO.getDatosContacto();
			busqueda = validarExistenciaPaciente(infoPaciente);
			if(!busqueda.isEmpty()) {
				StringBuilder sb = new StringBuilder();
				Optional<PerPaciente> px;
				for (PerPersona perPersona : busqueda) {
					px = pacienteRepository.findById(perPersona.getIdPersona());
					sb.append(px.get().getFolio()+",");
				}
				sb.deleteCharAt(sb.length()-1); //eliminar la coma
				throw new BusinessException("El paciente ya se encuentra registrado, por favor revise, se encontraron los siguientes folios: "+sb.toString());
			}
	        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			//guardar los datos de la persona
	        persona.setNombrePropio1(infoPaciente.getNombrePropio1());
	        persona.setNombrePropio2(infoPaciente.getNombrePropio2());
			persona.setApellidoMaterno(infoPaciente.getApellidoMaterno());
			persona.setApellidoPaterno(infoPaciente.getApellidoPaterno());
			persona.setCurp(infoPaciente.getCurp());
			persona.setEdad(infoPaciente.getEdad());		
			offsetDateTime = OffsetDateTime.parse(infoPaciente.getFechaNacimiento());
			persona.setFechaNacimiento(offsetDateTime.toLocalDate());
			persona.setOcupacion(infoPaciente.getOcupacion());
			persona.setFechaRegistro(LocalDateTime.now());
			persona.setGenero(infoPaciente.getGenero());
			domicilioPersona.setCallePrincipal(domiPaciente.getCallePrincipal());
			domicilioPersona.setCodigoPostal(domiPaciente.getCodigoPostal());
			domicilioPersona.setEntidad(domiPaciente.getEntidad());
			domicilioPersona.setEntreCalles1(domiPaciente.getEntreCalles1());
			domicilioPersona.setLocalidad(domiPaciente.getLocalidad());
			domicilioPersona.setMunicipio(domiPaciente.getMunicipio());
			domiRepository.save(domicilioPersona);
			personaRepository.save(persona);
			persona.setDomicilio(domicilioPersona);
			//registramos email
			if(!datosContactoPaciente.getCorreoElectronico().isBlank() || !datosContactoPaciente.getCorreoElectronico().isEmpty()) {
				datosContactoPersona = new PerDatosContacto();
				datosContactoPersona.setPersona(persona);
				datosContactoPersona.setCodigoIdentificador("EMA");
				datosContactoPersona.setIdentificador(datosContactoPaciente.getCorreoElectronico());
				datosContactoPersona.setFechaRegistro(LocalDateTime.now());
				contactoRepository.save(datosContactoPersona);	
			}
			if(!datosContactoPaciente.getNumeroTelefonico().isBlank() || !datosContactoPaciente.getNumeroTelefonico().isEmpty()) {
				datosContactoPersona = new PerDatosContacto();
				datosContactoPersona.setPersona(persona);
				datosContactoPersona.setCodigoIdentificador("CELULAR");
				datosContactoPersona.setIdentificador(datosContactoPaciente.getNumeroTelefonico());
				datosContactoPersona.setFechaRegistro(LocalDateTime.now());
				datosContactoPersona.setFechaRegistro(LocalDateTime.now());
				contactoRepository.save(datosContactoPersona);
			}
			personaRepository.save(persona);
			//registro de persona como paciente
			LocalDateTime siguienteCita = LocalDateTime.now();
			siguienteCita = siguienteCita.plusDays(30);
			paciente = new PerPaciente();
			paciente.setPersona(persona);
			paciente.setFolio(infoPaciente.getFolio());
			paciente.setFechaAlta(null);
			paciente.setMotivoConsulta(infoPaciente.getMotivoConsulta());
			paciente.setPathSistema("expedientes/paciente/"+persona.getIdPersona()+"/");
			paciente.setPeso(9.5D);
			signosVitales.setFechaToma(LocalDateTime.now());
			signosVitales.setOxigenacion(signos.getOxigenacion());
			signosVitales.setPresionDiast(Integer.valueOf(signos.getPresionDiast()));
			signosVitales.setPresionSist(Integer.valueOf(signos.getPresionSist()));
			signosVitales.setTemperatura(Double.valueOf(signos.getTemperatura()));
			signosRepository.save(signosVitales);
			paciente.setSignosVitales(signosVitales);
			paciente.setUltimaVisita(LocalDateTime.now());
			paciente.setProximaCita(siguienteCita);
			pacienteRepository.save(paciente);
			//registro exitoso
			exito = true;
			
		} catch(Exception e) {
			throw new BusinessException(e.getMessage());
		}
		
		return exito;
	}
	/**
	 * Validar si la persona ya se encuentra registrada en base.
	 * @param infoPaciente
	 * @return
	 */
	private List<PerPersona> validarExistenciaPaciente(GmjInformacionPacienteDTO infoPaciente) {
		return personaRepository.buscarExistenciaPaciente(infoPaciente.getNombrePropio1(),infoPaciente.getNombrePropio2(), infoPaciente.getApellidoPaterno(), infoPaciente.getApellidoMaterno());
		
	}

}
