package mx.com.mundodafne.gmj.orq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.gmj.orq.app.GmjConcentrarInfoAppImpl;
import mx.com.mundodafne.gmj.orq.dto.global.GmjObjetoPacienteDTO;
import mx.com.mundodafne.gmj.orq.dto.historialclinico.GmjHistorialClinicoDTO;
import mx.com.mundodafne.gmj.orq.utils.GmjResponseHandler;

/**
 * Controlador que recibe toda la informacion a concentrar.
 * */
@RestController
@RequestMapping("/api/v1/orq")
@CrossOrigin(origins="http://localhost:4200")
public class GmjRecibeInfoController {
	
	@Autowired GmjConcentrarInfoAppImpl appConcentrarInfo;
	
	@GetMapping("concentra/")
	public void concentraInfo(@RequestBody GmjObjetoPacienteDTO objetoPacienteDTO) {
		appConcentrarInfo.concentrarInfo(objetoPacienteDTO);
	}
}
