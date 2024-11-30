/**
 * 
 */
package mx.com.mundodafne.gmj.orq.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import mx.com.mundodafne.gmj.orq.dto.global.GmjObjetoPacienteDTO;
import mx.com.mundodafne.gmj.orq.dto.historialclinico.GmjHistorialClinicoDTO;
import mx.com.mundodafne.gmj.orq.dto.hojafrontal.GmjHojaFrontalDTO;
import mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente.GmjInformacionPacienteDTO;
import mx.com.mundodafne.gmj.orq.utils.ValidacionException;
import reactor.core.publisher.Mono;

/**
 * 
 */
@Service
public class GmjConcentrarInfoAppImpl implements IGmjConcentrarInfoApp {
	
	@Autowired
	private WebClient.Builder webClientBuilder;

	
	private void consumirAPI(Object objeto) {
		if (objeto != null && objeto instanceof GmjHojaFrontalDTO) {
			String url = "http://localhost:80074/api/v1/hojafrontal/registra";
			WebClient wb = webClientBuilder.build();
			wb.post()
			.uri(url)
			.body(Mono.just(objeto),GmjHojaFrontalDTO.class)
			.retrieve()
			.bodyToMono(ResponseEntity.class)
			.block();	
		}
	}
	
	@Override
	public ResponseEntity<Object> registrarInfoHistorialClinico(GmjHojaFrontalDTO hojaFrontal) {
		
		return null;
	}

	/***
	 * consumir micro hojafrontal
	 */
	@Override
	public ResponseEntity<Object> registrarInfoHojaFrontal(GmjHojaFrontalDTO hojaFrontal) {
		String url = "http://localhost:80074/api/v1/hojafrontal/registra";
		WebClient wb = webClientBuilder.build();
		return wb.post()
		.uri(url)
		.body(Mono.just(hojaFrontal),GmjHojaFrontalDTO.class)
		.retrieve()
		.bodyToMono(ResponseEntity.class)
		.block();
	}

	@Override
	public ResponseEntity<Object> registrarInfoNotaMedicaPaciente() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResponseEntity<Object> registrarInfoNotaEnfermeriaPaciente() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void concentrarInfo(GmjObjetoPacienteDTO objetoPacienteDTO) throws ValidacionException {
		if (objetoPacienteDTO.getHojaFrontal() != null) {			
			if (objetoPacienteDTO.getHojaFrontal().getInformacionPx() != null) {
				throw new ValidacionException("No hay info de paciente a guardar.");
			} else {
				GmjHojaFrontalDTO hojaFrontalDTO = objetoPacienteDTO.getHojaFrontal();
				consumirAPI(hojaFrontalDTO);				
			}
			
			if(objetoPacienteDTO.getHistoriaClinica() != null) {
				consumirAPI(objetoPacienteDTO.getHistoriaClinica());
			} else {
				throw new ValidacionException("No hay datos de historia clinica a guardar.");
			}
			
		} else {
			throw new ValidacionException("Hace falta definir toda la hoja frontal.");
		}
		
	}

}
