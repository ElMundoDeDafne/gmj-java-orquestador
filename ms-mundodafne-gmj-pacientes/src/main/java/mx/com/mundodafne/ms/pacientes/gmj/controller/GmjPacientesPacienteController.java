package mx.com.mundodafne.ms.pacientes.gmj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.ms.pacientes.gmj.app.GmjPacientesAltaPacienteApp;

@RestController
@RequestMapping("api/v1/paciente")
public class GmjPacientesPacienteController {
	@Autowired
	private GmjPacientesAltaPacienteApp altaPacienteApp;
	
}
