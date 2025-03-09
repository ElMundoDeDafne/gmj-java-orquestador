package mx.com.mundodafne.gmj.hoja.frontal.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDatosContactoPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjDomicilioPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjFrontalRespSalidaDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHistoriaClinicaDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHojaFrontalDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjInformacionPacienteDTO;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerPersona;
import mx.com.mundodafne.gmj.hoja.frontal.exception.BusinessException;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjPersonaRepository;
import mx.com.mundodafne.gmj.hoja.frontal.utils.Validators;

@Service
public class GmjHojaFrontalAppImpl implements GmjHojaFrontalApp {
	
	@Autowired GmjPersonaRepository personaRepository;
	@Autowired GmjValdadoresAppImpl validadoresApp;
	
	@Override
	public GmjFrontalRespSalidaDTO registrarInfoBD(GmjHojaFrontalDTO hojaFrontalDTO) throws BusinessException {
		GmjFrontalRespSalidaDTO salida = new GmjFrontalRespSalidaDTO();
		String[] msgs = null;
		
		GmjInformacionPacienteDTO infoPx = (GmjInformacionPacienteDTO) Validators.checkNull(hojaFrontalDTO.getInformacionPx());
		validadoresApp.validarInfoPaciente(infoPx);
		GmjDatosContactoPacienteDTO datosContactoPx = hojaFrontalDTO.getDatosContacto();
		GmjDomicilioPacienteDTO domicilioPx = hojaFrontalDTO.getDomicilioPaciente();
		GmjHistoriaClinicaDTO historiaClinica =hojaFrontalDTO.getHistoriaClinica();
		List<PerPersona> personas = personaRepository.findAll();
		
		
//		GmjPersona nuevaPersona = new GmjPersona();
		
//		personaRepository.saveAndFlush(nuevaPersona);
		//validaciones de datos
		
		
		return salida;

	}

}
