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
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerPaciente;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerPersona;
import mx.com.mundodafne.gmj.hoja.frontal.exception.BusinessException;
import mx.com.mundodafne.gmj.hoja.frontal.exception.NotFoundException;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjPacienteRepository;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjPersonaRepository;
import mx.com.mundodafne.gmj.hoja.frontal.utils.Validators;

@Service
public class GmjHojaFrontalAppImpl implements GmjHojaFrontalApp {
	
	@Autowired GmjPersonaRepository personaRepository;
	@Autowired GmjValdadoresAppImpl validadoresApp;
	@Autowired GmjPacienteRepository pacienteRepository;
	@Autowired GmjRegistrarPacientesAppImpl registrarPacienteApp;
	
	@Override
	public GmjFrontalRespSalidaDTO registrarInfoBD(GmjHojaFrontalDTO hojaFrontalDTO) throws BusinessException, NotFoundException {
		GmjFrontalRespSalidaDTO salida = new GmjFrontalRespSalidaDTO();
		String[] msgs = null;
		List<String> mensajes = new ArrayList();
		
		GmjInformacionPacienteDTO infoPx = (GmjInformacionPacienteDTO) Validators.checkNull(hojaFrontalDTO.getInformacionPx());		
		GmjDatosContactoPacienteDTO datosContactoPx = (GmjDatosContactoPacienteDTO) Validators.checkNull(hojaFrontalDTO.getDatosContacto());
		GmjDomicilioPacienteDTO domicilioPx = (GmjDomicilioPacienteDTO) Validators.checkNull(hojaFrontalDTO.getDomicilioPaciente());
		GmjHistoriaClinicaDTO historiaClinica = (GmjHistoriaClinicaDTO) Validators.checkNull(hojaFrontalDTO.getHistoriaClinica());
		
		boolean testValidators = true;
		if(testValidators) {
			validadoresApp.validarInfoPaciente(infoPx);
			validadoresApp.validarDomicilioPx(domicilioPx);
			validadoresApp.validarHistoriaClinicaPx(historiaClinica);
			validadoresApp.validarDatosContactoPx(datosContactoPx);			
		}
		if(registrarPacienteApp.registroPaciente(hojaFrontalDTO)) {
			salida.setExito(true);
		}
		return salida;

	}

}
