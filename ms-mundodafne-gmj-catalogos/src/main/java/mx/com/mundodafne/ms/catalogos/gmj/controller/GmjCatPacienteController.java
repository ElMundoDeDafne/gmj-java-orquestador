package mx.com.mundodafne.ms.catalogos.gmj.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cat/v1.0")
public class GmjCatPacienteController {

	@GetMapping("/persona/profesiones/get")
	public void obtenerProfesiones() {
		
	}
	
	@GetMapping("/paciente/get")
	public ResponseEntity<Map<String, Object>> obtenerDatosPaciente(@RequestParam Long idPaciente) {
		Map<String,Object> respuesta = new HashMap();
		respuesta.put("app", idPaciente);
		respuesta.put("datos","funciona");
		return ResponseEntity.ok(respuesta);
	}
}
