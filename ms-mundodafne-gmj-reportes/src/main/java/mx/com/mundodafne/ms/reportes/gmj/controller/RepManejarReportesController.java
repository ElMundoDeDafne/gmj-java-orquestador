package mx.com.mundodafne.ms.reportes.gmj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.ms.reportes.gmj.app.RepImprimirReporteApp;
import mx.com.mundodafne.ms.reportes.gmj.dto.RepEntradaReportesDTO;
import mx.com.mundodafne.ms.reportes.gmj.dto.RepSalidaReportesDTO;

@RestController
@RequestMapping("/api/reportes/v1.0/")
public class RepManejarReportesController {

	@Autowired private RepImprimirReporteApp imprimirReporteApp;
	
	public RepSalidaReportesDTO obtenerReportePorCodigo(RepEntradaReportesDTO entradaReportesDTO) {
		return imprimirReporteApp.obtenerReportePorCodigo(entradaReportesDTO);
	}
}
