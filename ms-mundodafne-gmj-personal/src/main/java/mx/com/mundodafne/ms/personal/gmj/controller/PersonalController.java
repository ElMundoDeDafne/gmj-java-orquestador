package mx.com.mundodafne.ms.personal.gmj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.ms.personal.gmj.dto.RegistroPersonalDTO;
import mx.com.mundodafne.ms.personal.gmj.entity.PerPersonalEntity;

@RestController
@RequestMapping("api/v1.0/personal")
public class PersonalController {
	
	@PostMapping("/get")
	public List obtenerPersonal() throws Exception{
		return new ArrayList();
	}
	
	@PostMapping("/registro/")
	public void registrarPersonal(@RequestBody RegistroPersonalDTO registroDTO) {
		
	}
}
