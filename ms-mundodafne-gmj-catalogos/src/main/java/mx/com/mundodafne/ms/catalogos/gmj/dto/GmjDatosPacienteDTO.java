package mx.com.mundodafne.ms.catalogos.gmj.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import mx.com.mundodafne.ms.catalogos.gmj.paciente.dto.GmjPacienteAntNoPatologicoDTO;
import mx.com.mundodafne.ms.catalogos.gmj.paciente.dto.GmjPacienteAntPatologicosDTO;
import mx.com.mundodafne.ms.catalogos.gmj.paciente.dto.GmjPacienteEsqVacunacionDTO;
import mx.com.mundodafne.ms.catalogos.gmj.paciente.dto.GmjPacienteMedicoTratanteDTO;

public class GmjDatosPacienteDTO extends GmjDatosPersonaDTO {
	private Integer edad;
	private String especialidad;
	private Double peso;
	private Double estatura;
	private LocalDateTime fechaIngreso;
	private LocalDateTime fechaAlta;
	private String pathSistema;
	private GmjPacienteMedicoTratanteDTO[] medicoTratante;
	private GmjPacienteAntNoPatologicoDTO antecedentesNoPat;
	private GmjPacienteAntPatologicosDTO antecedentesPat;
	private Double imc;
	
	
}
