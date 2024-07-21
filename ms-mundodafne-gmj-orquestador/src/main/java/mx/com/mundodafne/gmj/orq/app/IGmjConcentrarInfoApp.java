/**
 * 
 */
package mx.com.mundodafne.gmj.orq.app;

import org.springframework.http.ResponseEntity;

import mx.com.mundodafne.gmj.orq.dto.hojafrontal.GmjHojaFrontalDTO;

/**
 * 
 */
public interface IGmjConcentrarInfoApp {
	ResponseEntity<Object> registrarInfoHistorialClinico(GmjHojaFrontalDTO hojaFrontal);
	ResponseEntity<Object> registrarInfoNotaMedicaPaciente();
	ResponseEntity<Object> registrarInfoNotaEnfermeriaPaciente();
	ResponseEntity<Object> registrarInfoHojaFrontal(GmjHojaFrontalDTO hojaFrontal);
	
	
}
