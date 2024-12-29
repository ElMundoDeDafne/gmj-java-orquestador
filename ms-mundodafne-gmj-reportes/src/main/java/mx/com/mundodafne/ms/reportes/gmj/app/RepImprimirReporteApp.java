package mx.com.mundodafne.ms.reportes.gmj.app;

import mx.com.mundodafne.ms.reportes.gmj.dto.RepEntradaReportesDTO;
import mx.com.mundodafne.ms.reportes.gmj.dto.RepSalidaReportesDTO;

public interface RepImprimirReporteApp {
	String regresarBase64();
	RepSalidaReportesDTO obtenerReportePorCodigo(RepEntradaReportesDTO entradaReportesDTO);
}
