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
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjPacienteRepository;
import mx.com.mundodafne.gmj.hoja.frontal.repository.GmjPersonaRepository;
import mx.com.mundodafne.gmj.hoja.frontal.utils.Validators;

@Service
public class GmjHojaFrontalAppImpl implements GmjHojaFrontalApp {
	
	@Autowired GmjPersonaRepository personaRepository;
	@Autowired GmjValdadoresAppImpl validadoresApp;
	@Autowired GmjPacienteRepository pacienteRepository;
	
	@Override
	public GmjFrontalRespSalidaDTO registrarInfoBD(GmjHojaFrontalDTO hojaFrontalDTO) throws BusinessException {
		GmjFrontalRespSalidaDTO salida = new GmjFrontalRespSalidaDTO();
		String[] msgs = null;
		
		GmjInformacionPacienteDTO infoPx = (GmjInformacionPacienteDTO) Validators.checkNull(hojaFrontalDTO.getInformacionPx());		
		GmjDatosContactoPacienteDTO datosContactoPx = (GmjDatosContactoPacienteDTO) Validators.checkNull(hojaFrontalDTO.getDatosContacto());
		GmjDomicilioPacienteDTO domicilioPx = (GmjDomicilioPacienteDTO) Validators.checkNull(hojaFrontalDTO.getDomicilioPaciente());
		GmjHistoriaClinicaDTO historiaClinica = (GmjHistoriaClinicaDTO) Validators.checkNull(hojaFrontalDTO.getHistoriaClinica());
		
		boolean testValidators = false;
		if(testValidators) {
			validadoresApp.validarInfoPaciente(infoPx);
			validadoresApp.validarDomicilioPx(domicilioPx);
			validadoresApp.validarHistoriaClinicaPx(historiaClinica);
			validadoresApp.validarDatosContactoPx(datosContactoPx);			
		}
		
		List<PerPersona> personas = personaRepository.findAll();
		PerPaciente pacienteNuevo = new PerPaciente();
		PerPersona per = new PerPersona();
		
		per.setNombrePropio1("Juanito");
		per.setApellidoMaterno("ApMat");
		per.setApellidoPaterno("ApPat");
		per.setGenero("M");
		per.setOcupacion("ING. INFORMATICO");
		pacienteNuevo.setMotivoConsulta("prueba");
		pacienteNuevo.setPeso(70D);
		pacienteNuevo.setPersona(per);
		personaRepository.save(per);
		pacienteRepository.save(pacienteNuevo);
		List pacientes  = pacienteRepository.findAll();
		
		
//		GmjPersona nuevaPersona = new GmjPersona();
		
//		personaRepository.saveAndFlush(nuevaPersona);
		//validaciones de datos
		
		
		return salida;

	}

}
