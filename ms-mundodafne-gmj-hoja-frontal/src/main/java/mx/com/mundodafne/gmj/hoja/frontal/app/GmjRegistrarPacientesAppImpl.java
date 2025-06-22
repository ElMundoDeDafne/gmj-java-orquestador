package mx.com.mundodafne.gmj.hoja.frontal.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDatosContactoPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDomicilioPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHojaFrontalDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjInformacionPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjRequestFrontalDTO;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerDatosContacto;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerDomicilio;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerPaciente;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerPersona;
import mx.com.mundodafne.gmj.hoja.frontal.exception.BusinessException;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjDatosContactoPacienteRepository;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjDomicilioPacienteRepository;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjPacienteRepository;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjPersonaRepository;

@Service
public class GmjRegistrarPacientesAppImpl implements GmjRegistrarPacienteApp {

	@Autowired GmjPersonaRepository personaRepository;
	@Autowired GmjDomicilioPacienteRepository domiRepository;
	@Autowired GmjDatosContactoPacienteRepository contactoRepository;
	@Autowired GmjPacienteRepository pacienteRepository;
	
	@Override
	public boolean registroPaciente(GmjHojaFrontalDTO requestFrontalDTO) throws BusinessException {
		// TODO Auto-generated method stub
		PerPersona persona;
		PerDomicilio domicilioPersona;
		PerDatosContacto datosContactoPersona;
		PerPaciente paciente;
		
		GmjInformacionPacienteDTO infoPaciente;
		GmjDomicilioPacienteDTO domiPaciente;
		GmjDatosContactoPacienteDTO datosContactoPaciente;
		
		boolean exito = false;
		
		
		/**
		 * mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDatosContactoPacienteDTO@7d9ffd3c
mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDomicilioPacienteDTO@3e8f247f
mx.com.mundodafne.gmj.hoja.frontal.dto.GmjInformacionPacienteDTO@30e1dd06
		 * */
		try {
			persona = new PerPersona();
			domicilioPersona = new PerDomicilio();
			datosContactoPersona = new PerDatosContacto();
	        OffsetDateTime offsetDateTime;
			paciente = new PerPaciente();
			infoPaciente = requestFrontalDTO.getInformacionPx();
			domiPaciente = requestFrontalDTO.getDomicilioPaciente();
			datosContactoPaciente = requestFrontalDTO.getDatosContacto();
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
			datosContactoPersona.setPersona(persona);
			datosContactoPersona.setCodigoIdentificador("EMA");
			datosContactoPersona.setIdentificador(datosContactoPaciente.getCorreoElectronico());
			datosContactoPersona.setFechaRegistro(LocalDateTime.now());
			contactoRepository.save(datosContactoPersona);
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
			paciente = new PerPaciente();
			paciente.setPersona(persona);
			paciente.setFolio(infoPaciente.getFolio());
			paciente.setFechaAlta(null);
			paciente.setMotivoConsulta(infoPaciente.getMotivoConsulta());
			paciente.setPathSistema("expedientes/paciente/"+persona.getIdPersona()+"/");
			paciente.setPeso(89.5D);
			pacienteRepository.save(paciente);
			//registro exitoso
			exito = true;
			
		} catch(Exception e) {
			throw new BusinessException(e.getMessage());
		}
		
		return exito;
	}

}
