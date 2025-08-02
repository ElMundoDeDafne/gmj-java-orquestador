package mx.com.mundodafne.ms.catalogos.gmj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cat/v1.0")
public class GmjCatPacienteController {

	@GetMapping("/persona/profesiones/get")
	public void obtenerProfesiones() {
		
	}
	
	@GetMapping("/paciente/get")
	public void obtenerDatosPaciente() {
		
	}
}
