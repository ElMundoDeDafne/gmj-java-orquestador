package mx.com.mundodafne.ms.catalogos.gmj.paciente.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class GmjPacienteEsqVacunacionDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -27269817442605257L;
	private String nombreBiologico;
	private LocalDate fechaAplicacion;
	/**
	 * @return the nombreBiologico
	 */
	public String getNombreBiologico() {
		return nombreBiologico;
	}
	/**
	 * @param nombreBiologico the nombreBiologico to set
	 */
	public void setNombreBiologico(String nombreBiologico) {
		this.nombreBiologico = nombreBiologico;
	}
	/**
	 * @return the fechaAplicacion
	 */
	public LocalDate getFechaAplicacion() {
		return fechaAplicacion;
	}
	/**
	 * @param fechaAplicacion the fechaAplicacion to set
	 */
	public void setFechaAplicacion(LocalDate fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}
	
	
}
