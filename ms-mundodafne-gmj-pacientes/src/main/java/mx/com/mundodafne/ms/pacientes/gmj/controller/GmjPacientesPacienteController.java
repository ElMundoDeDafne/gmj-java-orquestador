package mx.com.mundodafne.ms.pacientes.gmj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.ms.pacientes.gmj.app.GmjObtenerInfoPacientesApp;
import mx.com.mundodafne.ms.pacientes.gmj.app.GmjObtenerInfoPacientesAppImpl;
import mx.com.mundodafne.ms.pacientes.gmj.app.GmjPacientesAltaPacienteAppImpl;
import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesInDTO;
import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesOutDTO;
import mx.com.mundodafne.ms.pacientes.gmj.exception.BusinessException;

@RestController
@RequestMapping("api/v1/paciente")
@CrossOrigin(origins = "*")
public class GmjPacientesPacienteController {
	
	@Autowired
	private GmjPacientesAltaPacienteAppImpl altaPacienteApp;
	@Autowired
	private GmjObtenerInfoPacientesAppImpl obtenerInfoPacientesApp;
	
	@PostMapping("/busqueda/get")
	public List<GmjBusquedaPacientesOutDTO> busquedaPacientesPorFiltro(@RequestBody GmjBusquedaPacientesInDTO in) throws BusinessException {
		return obtenerInfoPacientesApp.busquedaPacientesFiltro(in);
		
	}	
}//ve por mi mama siiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii
