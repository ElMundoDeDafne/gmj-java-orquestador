/**
 * 
 */
package mx.com.mundodafne.gmj.orq.app;

import org.springframework.http.ResponseEntity;

import mx.com.mundodafne.gmj.orq.dto.global.GmjObjetoPacienteDTO;
import mx.com.mundodafne.gmj.orq.dto.hojafrontal.GmjHojaFrontalDTO;
import mx.com.mundodafne.gmj.orq.utils.ValidacionException;

/**
 * 
 */
public interface IGmjConcentrarInfoApp {
	void concentrarInfo(GmjObjetoPacienteDTO objetoPacienteDTO) throws ValidacionException;
	ResponseEntity<Object> registrarInfoHistorialClinico(GmjHojaFrontalDTO hojaFrontal);
	ResponseEntity<Object> registrarInfoNotaMedicaPaciente();
	ResponseEntity<Object> registrarInfoNotaEnfermeriaPaciente();
	ResponseEntity<Object> registrarInfoHojaFrontal(GmjHojaFrontalDTO hojaFrontal);
	
	
}
