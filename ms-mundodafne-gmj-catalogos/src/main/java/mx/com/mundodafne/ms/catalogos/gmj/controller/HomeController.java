package mx.com.mundodafne.ms.catalogos.gmj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalogos")
public class HomeController {
	
	@Value("${spring.application.name}") String nameMs;
	
	@GetMapping("/home")
	public ResponseEntity<Map<String,Object>> obtenerEspecialidades() {
		Map<String,Object> respuesta = new HashMap();
		respuesta.put("app", nameMs);
		respuesta.put("datos","funciona");
		return ResponseEntity.ok(respuesta);
	}
}
