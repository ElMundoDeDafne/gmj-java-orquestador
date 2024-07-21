package mx.com.mundodafne.gmj.orq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.gmj.orq.app.GmjConcentrarInfoAppImpl;
import mx.com.mundodafne.gmj.orq.dto.hojafrontal.GmjHojaFrontalDTO;

@RestController
@RequestMapping("/api/v1/orq/send")
public class GmjEnviaObjPacienteController {
	
	@Autowired
	GmjConcentrarInfoAppImpl app;

	@PostMapping("/hojafrontal")
	public ResponseEntity<Object> registraHojaFrontal(GmjHojaFrontalDTO hojaFrontal){
		ResponseEntity<Object> respEnt;
		respEnt = app.registrarInfoHojaFrontal(hojaFrontal);
		return respEnt;
	}
	
}
