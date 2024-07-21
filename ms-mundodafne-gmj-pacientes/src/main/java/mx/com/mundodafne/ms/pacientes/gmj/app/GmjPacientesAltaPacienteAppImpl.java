package mx.com.mundodafne.ms.pacientes.gmj.app;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjPacientesPacienteDTO;

@Service
public class GmjPacientesAltaPacienteAppImpl implements GmjPacientesAltaPacienteApp{

	@Override
	@PostMapping(path = "/paciente/registrar/")
	public void registrarPaciente(GmjPacientesPacienteDTO pacienteDTO) {
		// TODO Auto-generated method stub
		
	}

}
