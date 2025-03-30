package mx.com.mundodafne.ms.pacientes.gmj.app;

public interface GmjPacientesConsultarDatosPacienteApp {
	/**
	 * Metodos para obtener datos del paciente (por idPaciente)
	 * 
	 * */
	void obtenerDatosPaciente(Long idPaciente);
	/*
	 * Metodo para obtener domicilio de paciente por id
	 * */
	void obtenerDomicilioPaciente(Long idPaciente);
}
