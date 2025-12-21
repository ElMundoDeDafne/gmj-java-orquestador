/**
 * 
 */
package mx.com.mundodafne.ms.personal.gmj.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import mx.com.mundodafne.ms.personal.gmj.dto.RegistroPersonalDTO;
import mx.com.mundodafne.ms.personal.gmj.dto.RespuestaGenericaMSDTO;
import mx.com.mundodafne.ms.personal.gmj.entity.CatPerfilProfesionalEntity;
import mx.com.mundodafne.ms.personal.gmj.entity.PerDomicilioEntity;
import mx.com.mundodafne.ms.personal.gmj.entity.PerPersonaEntity;
import mx.com.mundodafne.ms.personal.gmj.entity.PerPersonalEntity;
import mx.com.mundodafne.ms.personal.gmj.repository.PersonaRepository;
import mx.com.mundodafne.ms.personal.gmj.repository.PersonalRepository;
import reactor.core.publisher.Mono;
@Service
public class RegistroPersonalAppImpl implements RegistroPersonalApp {

	@Autowired PersonalRepository personalRepo;
	@Autowired PersonaRepository personaRepo;
	@PersistenceContext EntityManager em;
	private WebClient webClient;
	
	@Transactional
	@Override
	public Boolean registrarPersonal(RegistroPersonalDTO registroDTO) {
		PerPersonalEntity entityPersonal = new PerPersonalEntity();
		PerPersonaEntity entityPersona = new PerPersonaEntity();
		PerDomicilioEntity entityDomicilio = new PerDomicilioEntity();
		entityDomicilio = em.find(PerDomicilioEntity.class, 3);
		CatPerfilProfesionalEntity catPerfilProfesionalEntity;
		catPerfilProfesionalEntity = obtieneEspecialidad(registroDTO.getTipoPersonal());
		boolean registroExitoso = true;
		LocalDate nacimiento = localDateAString(registroDTO.getFechaNacimiento());
		entityPersona.setApellidoMaterno(registroDTO.getApellidoMaterno());
		entityPersona.setApellidoPaterno(registroDTO.getApellidoPaterno());
		entityPersona.setCurp(registroDTO.getCurp());
		entityPersona.setFechaRegistro(LocalDateTime.now());
		entityPersona.setFechaNacimiento(nacimiento);
		entityPersona.setDomicilio(null);
		entityPersona.setNombrePropio1(registroDTO.getNombrePropioUno());
		entityPersona.setNombrePropio2(registroDTO.getNombrePropioDos());
		personaRepo.save(entityPersona);
		entityPersonal.setPersona(entityPersona);
		entityPersonal.setCedulaProfesional(registroDTO.getCedulaProfesional());
		entityPersonal.setCedulaProfesionalEspecialidad(registroDTO.getCedulaProfEspe());
		entityPersonal.setFechaAlta(entityPersona.getFechaRegistro());
		entityPersonal.setCatPerfilProfesionalEntity(catPerfilProfesionalEntity);
		em.persist(entityPersonal);
//		personalRepo.save(entityPersonal);
		return registroExitoso;
	}
	
	private LocalDate localDateAString(String fechaNacimiento) {
		String[] fechaPars = fechaNacimiento.split("\\/");
		return LocalDate.of(Integer.valueOf(fechaPars[2]),Integer.valueOf(fechaPars[1]),Integer.valueOf(fechaPars[0]));		
	}
	
	private CatPerfilProfesionalEntity obtieneEspecialidad(String codigo) {
		webClient = WebClient.create();
		return webClient.get()
				.uri("http://localhost:8091/api/cat/v1.0/perfiles/get/".concat(codigo))
				.retrieve()
				.bodyToMono(new ParameterizedTypeReference<RespuestaGenericaMSDTO<CatPerfilProfesionalEntity>>() {})
				.map(RespuestaGenericaMSDTO::getDatos)
				.block();
	}
}
