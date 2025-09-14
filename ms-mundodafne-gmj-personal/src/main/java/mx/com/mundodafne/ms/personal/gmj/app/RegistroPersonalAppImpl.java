/**
 * 
 */
package mx.com.mundodafne.ms.personal.gmj.app;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import mx.com.mundodafne.ms.personal.gmj.dto.RegistroPersonalDTO;
import mx.com.mundodafne.ms.personal.gmj.entity.PerPersonaEntity;
import mx.com.mundodafne.ms.personal.gmj.entity.PerPersonalEntity;
import mx.com.mundodafne.ms.personal.gmj.repository.PersonaRepository;
import mx.com.mundodafne.ms.personal.gmj.repository.PersonalRepository;

public class RegistroPersonalAppImpl implements RegistroPersonalApp {

	@Autowired PersonalRepository personalRepo;
	@Autowired PersonaRepository personaRepo;
	
	@Override
	public Boolean registrarPersonal(RegistroPersonalDTO registroDTO) {
		PerPersonalEntity entityPersonal = new PerPersonalEntity();
		PerPersonaEntity entityPersona = new PerPersonaEntity();
		boolean registroExitoso = true;
		LocalDate nacimiento = localDateAString(registroDTO.getFechaNacimiento());
		entityPersona.setApellidoMaterno(registroDTO.getApellidoMaterno());
		entityPersona.setApellidoPaterno(registroDTO.getApellidoPaterno());
		entityPersona.setCurp("");
		entityPersona.setFechaRegistro(LocalDateTime.now());
		entityPersona.setFechaNacimiento(nacimiento);
		entityPersona.setDomicilio(null);
		personaRepo.save(entityPersona);
		entityPersonal.setCedulaProfesional(registroDTO.getCedulaProfesional());
		entityPersonal.setCedulaProfesionalEspecialidad(registroDTO.getCedulaProfEspe());
		entityPersonal.setFechaAlta(entityPersona.getFechaRegistro());
		entityPersonal.setPersona(entityPersona);
		personalRepo.save(entityPersonal);
		return registroExitoso;
	}

	private LocalDate localDateAString(String fechaNacimiento) {
		String[] fechaPars = fechaNacimiento.split("\\/");
		return LocalDate.of(Integer.valueOf(fechaPars[0]), Integer.valueOf(fechaPars[1]), Integer.valueOf(fechaPars[2]));		
	}
}
