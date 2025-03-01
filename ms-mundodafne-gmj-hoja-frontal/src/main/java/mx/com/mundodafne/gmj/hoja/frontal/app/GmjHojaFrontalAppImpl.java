package mx.com.mundodafne.gmj.hoja.frontal.app;

import org.springframework.stereotype.Service;

import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDatosContactoPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDomicilioPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjFrontalRespSalidaDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHistoriaClinicaDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHojaFrontalDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjInformacionPacienteDTO;

@Service
public class GmjHojaFrontalAppImpl implements GmjHojaFrontalApp {

	@Override
	public GmjFrontalRespSalidaDTO registrarInfoBD(GmjHojaFrontalDTO hojaFrontalDTO) {
		GmjFrontalRespSalidaDTO salida = null;
		String[] msgs = null;
		GmjInformacionPacienteDTO infoPx = hojaFrontalDTO.getInformacionPx();
		GmjDatosContactoPacienteDTO datosContactoPx = hojaFrontalDTO.getDatosContacto();
		GmjDomicilioPacienteDTO domicilioPx = hojaFrontalDTO.getDomicilioPaciente();
		GmjHistoriaClinicaDTO historiaClinica =hojaFrontalDTO.getHistoriaClinica();
		//validaciones de datos
		
		
		return salida;

	}

}
