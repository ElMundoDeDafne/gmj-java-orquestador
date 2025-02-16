package mx.com.mundodafne.ms.catalogos.gmj.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cat/v1.0")
public class GmjCatCodigoPostalController {
	
	@PostMapping("/cp/get")
	public void obtenerDomicilio() {
		
	}
}
