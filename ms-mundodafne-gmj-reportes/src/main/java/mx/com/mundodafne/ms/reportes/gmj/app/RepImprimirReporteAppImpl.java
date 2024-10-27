package mx.com.mundodafne.ms.reportes.gmj.app;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

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
}
