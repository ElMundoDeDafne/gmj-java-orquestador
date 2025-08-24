package mx.com.mundodafne.ms.catalogos.gmj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.ms.catalogos.gmj.app.GmjCatEspecialidadesAppImpl;

@RestController
@RequestMapping("/api/cat/v1.0")
@CrossOrigin(origins = "*")
public class GmjCatEspecialidadesController {
	
	@Autowired GmjCatEspecialidadesAppImpl app;
	
	/**
	 * Obtenemos lista de especialidades.
	 */
	@GetMapping("/esp/get")
	public ResponseEntity<Map<String,Object>> obtenerEspecialidades() {
		Map<String,Object> respuesta = new HashMap();
		List datosObtenidos = app.obtenerEspecialidades();
		respuesta.put("datos",datosObtenidos);
		return ResponseEntity.ok(respuesta);
	}
	@GetMapping("/esp/get/desc")
	public ResponseEntity<Map<String, Object>> obtenerEspecialidadPorCodigo(@RequestParam String codigo) {
		Map<String,Object> respuesta = new HashMap();
		String resp = app.obtenerEspecialidadPorCodigo(codigo);
		respuesta.put("datos", resp);
		return ResponseEntity.ok(respuesta);
	}
}
