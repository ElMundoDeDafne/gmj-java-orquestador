package mx.com.mundodafne.ms.reportes.gmj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.ms.reportes.gmj.app.RepImprimirReporteApp;
import mx.com.mundodafne.ms.reportes.gmj.dto.RepEntradaReportesDTO;
import mx.com.mundodafne.ms.reportes.gmj.dto.RepSalidaReportesDTO;

@RestController
@RequestMapping("/api/reportes/v1.0")
@CrossOrigin(origins = "*")
public class RepManejarReportesController {

	@Autowired private RepImprimirReporteApp imprimirReporteApp;
	
	@PostMapping("/reporte/get")
	public RepSalidaReportesDTO obtenerReportePorCodigo(@RequestBody RepEntradaReportesDTO entradaReportesDTO) {
		return imprimirReporteApp.obtenerReportePorCodigo(entradaReportesDTO);
	}
}
