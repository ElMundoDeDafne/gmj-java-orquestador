package mx.com.mundodafne.ms.catalogos.gmj.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cat/v1.0")
@CrossOrigin(origins = "*")
public class GmjCatalogosController {
	
	@GetMapping("/catalogos/get")
	public ResponseEntity<Map<String,Object>> obtenerCatalogos() {
		return null;
	}
	@GetMapping("/catalogos/get/{codigo}")
	public ResponseEntity<Map<String, Object>> obtenerCatalogoPorCodigo(String codigo){
		return null;
	}
	
	public ResponseEntity<Map<String,Object>> obtenerFilaCatalogo(){
		
	}
}
