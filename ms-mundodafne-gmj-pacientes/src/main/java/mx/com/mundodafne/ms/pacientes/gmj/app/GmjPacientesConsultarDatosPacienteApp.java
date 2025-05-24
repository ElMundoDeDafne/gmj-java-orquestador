package mx.com.mundodafne.ms.pacientes.gmj.app;

import java.util.List;

import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesInDTO;
import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesOutDTO;

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
	/**
	 * Metodo para buscar pacientes por criterio
	 * */
	GmjBusquedaPacientesOutDTO busquedaPacientes(GmjBusquedaPacientesInDTO entradaVO);
}
