package mx.com.mundodafne.ms.catalogos.gmj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	@GetMapping("/")
	public ResponseEntity<Map<String,Object>> obtenerEspecialidades() {
		Map<String,Object> respuesta = new HashMap();
		respuesta.put("datos","funciona");
		return ResponseEntity.ok(respuesta);
	}
}
