package mx.com.mundodafne.ms.reportes.gmj.app;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import mx.com.mundodafne.ms.reportes.gmj.dto.RepEntradaReportesDTO;
import mx.com.mundodafne.ms.reportes.gmj.dto.RepSalidaReportesDTO;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class RepImprimirReporteAppImpl implements RepImprimirReporteApp{

	@Override
	public String regresarBase64() {
		String base64 = "";
		Base64 b;
		
		try {
			Map<String, Object> parametros = new HashMap();
			parametros.put("NOMBRE_PACIENTE","CHRISTIAN YAMIL CASTILLO COVARRUBIAS");
			parametros.put("DIAGNOSTICO_PACIENTE","PROBABLE EM");
			parametros.put("EDAD_PACIENTE","27/10/2024 07:15 AM");
			JasperReport reporte = JasperCompileManager.compileReport("C:\\Users\\Christian\\Documents\\Proyectos\\SW expediente clinico\\reports\\recetaMedicaGMJ.jrxml");
			//Llenar el informe
			JasperPrint print = JasperFillManager.fillReport(reporte, parametros);
			byte[] pdfBytes = JasperExportManager.exportReportToPdf(print);
			base64 = Base64.getEncoder().encodeToString(pdfBytes);			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return base64;
	}

	@Override
	public RepSalidaReportesDTO obtenerReportePorCodigo(RepEntradaReportesDTO entradaReportesDTO) {
		Map parametrosReporte = new HashMap();
		RepSalidaReportesDTO salidaDTO = new RepSalidaReportesDTO();
		String base64 = null;
		try {
			for(String par : entradaReportesDTO.getParametros()) {
				String[] vals = par.split("="); 
				parametrosReporte.put(vals[0], vals[1]);
			}
			JasperReport reporte = JasperCompileManager.compileReport("C:\\Users\\Christian\\Documents\\Proyectos\\SW expediente clinico\\reports\\recetaMedicaGMJ.jrxml");
			JasperPrint print = JasperFillManager.fillReport(reporte, parametrosReporte);
			byte[] pdfBytes = JasperExportManager.exportReportToPdf(print);
			base64 = Base64.getEncoder().encodeToString(pdfBytes);
		} catch(Exception e) {
			System.out.println("Error al generar reporte... "+e.getMessage());
		}
		salidaDTO.setBase64(base64);
		return salidaDTO;
	}
}
