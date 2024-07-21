/**
 * 
 */
package mx.com.mundodafne.ms.pacientes.gmj.dto;

import java.io.Serializable;

/**
 * DTO para almacenamiento de antecedentes ginecologicos.
 */
public class GmjPacientesAntecGinecoDTO extends GmjPacientesPacienteDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3046995288783403880L;
	private String fechaInicioVidaSexual;
	private String fechaUltimaRegla;
	private String fechaUltimoParto;
	private int numeroHijosVivos;
	private int numeroGestaciones;
	private int numeroAbortos;
	private long idPacienteAntecGinec;
	
	public String getFechaInicioVidaSexual() {
		return fechaInicioVidaSexual;
	}
	public void setFechaInicioVidaSexual(String fechaInicioVidaSexual) {
		this.fechaInicioVidaSexual = fechaInicioVidaSexual;
	}
	public String getFechaUltimaRegla() {
		return fechaUltimaRegla;
	}
	public void setFechaUltimaRegla(String fechaUltimaRegla) {
		this.fechaUltimaRegla = fechaUltimaRegla;
	}
	public String getFechaUltimoParto() {
		return fechaUltimoParto;
	}
	public void setFechaUltimoParto(String fechaUltimoParto) {
		this.fechaUltimoParto = fechaUltimoParto;
	}
	public int getNumeroHijosVivos() {
		return numeroHijosVivos;
	}
	public void setNumeroHijosVivos(int numeroHijosVivos) {
		this.numeroHijosVivos = numeroHijosVivos;
	}
	public int getNumeroGestaciones() {
		return numeroGestaciones;
	}
	public void setNumeroGestaciones(int numeroGestaciones) {
		this.numeroGestaciones = numeroGestaciones;
	}
	public int getNumeroAbortos() {
		return numeroAbortos;
	}
	public void setNumeroAbortos(int numeroAbortos) {
		this.numeroAbortos = numeroAbortos;
	}
	public long getIdPacienteAntecGinec() {
		return idPacienteAntecGinec;
	}
	public void setIdPacienteAntecGinec(long idPacienteAntecGinec) {
		this.idPacienteAntecGinec = idPacienteAntecGinec;
	}
	
	
	
}
