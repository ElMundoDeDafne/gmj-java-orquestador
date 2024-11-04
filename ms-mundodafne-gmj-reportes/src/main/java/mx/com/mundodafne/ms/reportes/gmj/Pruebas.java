package mx.com.mundodafne.ms.reportes.gmj;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JREmptyDataSource;

public class Pruebas {
	public static void main(String[] args) {
		try {
			String base64 = regresarBase64();
			System.out.println(base64);
			decodeAndSavePdf(base64,"C:\\tmp\\export.pdf");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    static void decodeAndSavePdf(String base64String, String outputFilePath) throws IOException {
        // Decodificar la cadena Base64
        byte[] pdfBytes = Base64.getDecoder().decode(base64String);
        
        // Guardar el contenido decodificado como archivo PDF
        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            fos.write(pdfBytes);
        }
    }
	
	static String regresarBase64() {
		String base64 = "";
		Base64 b;
		
		try {
			Map<String, Object> parametros = new HashMap();
	        String pdfFile = "c:/tmp/reportes/output.pdf"; // Salida del archivo PDF
			parametros.put("NOMBRE_PACIENTE","CHRISTIAN YAMIL CASTILLO COVARRUBIAS");
			parametros.put("DIAGNOSTICO_PACIENTE","PROBABLE EM");
			parametros.put("NOTAS_RECETA_OBSERV","OBSERVACIONES DEL MEDICO EN TURNO");
			parametros.put("FECHA_IMPRESION_REC","27/10/2024 07:15 AM");
			parametros.put("EDAD_PACIENTE","33");
			JasperReport reporte = JasperCompileManager.compileReport("C:/Users/Christian/Documents/Proyectos/SW expediente clinico/reports/recetaMedicaGMJ.jrxml");
			JasperPrint print = JasperFillManager.fillReport(reporte, parametros,new JREmptyDataSource());
            JasperExportManager.exportReportToPdfFile(print, pdfFile);
			byte[] pdfBytes = JasperExportManager.exportReportToPdf(print);
			base64 = Base64.getEncoder().encodeToString(pdfBytes);		
			
            System.out.println("PDF generado exitosamente: " + pdfFile);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return base64;
	}	
}
