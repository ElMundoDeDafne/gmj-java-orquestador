package mx.com.mundodafne.ms.catalogos.gmj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.ms.catalogos.gmj.app.GmjCatPerfProfApp;
import mx.com.mundodafne.ms.catalogos.gmj.entity.CatPerfilProfesionalEntity;
import mx.com.mundodafne.ms.catalogos.gmj.repository.CatPerfilProfesionalRepository;

@RestController
@RequestMapping("/api/cat/v1.0")
@CrossOrigin(origins = "*")
public class GmjCatPerfilProfesionalController {

	@Autowired GmjCatPerfProfApp app; 
	
	@GetMapping("/perfiles/get")
	public ResponseEntity<Map<String,Object>> obtenerPerfilesProfesionales() {
		Map<String,Object> respuesta = new HashMap();
		respuesta.put("datos",app.obtenerPerfilesProfesionales());
		return ResponseEntity.ok(respuesta);
	}
	
	@GetMapping("/perfiles/get/{codigo}")
	public ResponseEntity<Map<String,Object>> obtenerPerfilesProfesionales(@PathVariable String codigo) {
		Map<String,Object> respuesta = new HashMap();
		respuesta.put("datos",app.obtenerPerfilPorCodigo(codigo));
		return ResponseEntity.ok(respuesta);
	}	
	
	
	
}
