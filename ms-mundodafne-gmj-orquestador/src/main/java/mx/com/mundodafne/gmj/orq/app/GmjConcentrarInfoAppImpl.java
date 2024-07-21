/**
 * 
 */
package mx.com.mundodafne.gmj.orq.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import mx.com.mundodafne.gmj.orq.dto.hojafrontal.GmjHojaFrontalDTO;
import reactor.core.publisher.Mono;

/**
 * 
 */
@Service
public class GmjConcentrarInfoAppImpl implements IGmjConcentrarInfoApp {
	
	@Autowired
	private WebClient.Builder webClientBuilder;

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

}
