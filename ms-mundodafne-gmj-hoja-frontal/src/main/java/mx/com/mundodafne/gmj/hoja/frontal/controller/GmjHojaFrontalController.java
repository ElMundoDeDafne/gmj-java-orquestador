package mx.com.mundodafne.gmj.hoja.frontal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.gmj.hoja.frontal.app.GmjHojaFrontalApp;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjFrontalRespSalidaDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHojaFrontalDTO;
import mx.com.mundodafne.gmj.hoja.frontal.exception.BusinessException;

@RestController
@RequestMapping("/api/frontal/v1.0")
@CrossOrigin(origins = "*")
public class GmjHojaFrontalController {
	@Autowired private GmjHojaFrontalApp hojaFrontalApp;
	
	@PostMapping("/registro/get")
	public GmjFrontalRespSalidaDTO registroHojaFrontal(@RequestBody GmjHojaFrontalDTO dto) throws BusinessException{
		return hojaFrontalApp.registrarInfoBD(dto);
	}
}
