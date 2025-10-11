package mx.com.mundodafne.ms.catalogos.gmj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.ms.catalogos.gmj.app.GmjCatEspecialidadesAppImpl;
import mx.com.mundodafne.ms.catalogos.gmj.app.GmjCatMunicipiosAppImpl;
import mx.com.mundodafne.ms.catalogos.gmj.entity.CatMunicipio;

@RestController
@RequestMapping("/api/cat/v1.0")
@CrossOrigin(origins = "*")
public class GmjCatLocalizacionController {
	@Autowired GmjCatMunicipiosAppImpl app;
	
	@GetMapping("/cp/get")
	public void obtenerDomicilio() {
		
	}
	
	@GetMapping("/municipios/get")
	public ResponseEntity<Map<String,Object>> obtenerMunicipios() {
		Map<String,Object> respuesta = new HashMap();
		List resp = app.findAllMunicipios();
		respuesta.put("datos",resp);
		return ResponseEntity.ok(respuesta);
	}
	
}
