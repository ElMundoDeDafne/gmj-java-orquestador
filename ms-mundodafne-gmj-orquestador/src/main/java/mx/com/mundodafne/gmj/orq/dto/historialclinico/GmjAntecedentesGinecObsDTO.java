package mx.com.mundodafne.gmj.orq.dto.historialclinico;

import java.io.Serializable;
import java.time.LocalDate;

public class GmjAntecedentesGinecObsDTO implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 5059608486700001035L;
	private LocalDate fechaUltimaCitologia;
	private LocalDate fechaUltimaRegla;
	private LocalDate fechaUltimoParto;
	private LocalDate fechaInicioVidaSexual;
	private int totalHijosVivos;
	private int numGestas;
	private int numAbortos;
	private int numPartos;
	public LocalDate getFechaUltimaCitologia() {
		return fechaUltimaCitologia;
	}
	public void setFechaUltimaCitologia(LocalDate fechaUltimaCitologia) {
		this.fechaUltimaCitologia = fechaUltimaCitologia;
	}
	public LocalDate getFechaUltimaRegla() {
		return fechaUltimaRegla;
	}
	public void setFechaUltimaRegla(LocalDate fechaUltimaRegla) {
		this.fechaUltimaRegla = fechaUltimaRegla;
	}
	public LocalDate getFechaUltimoParto() {
		return fechaUltimoParto;
	}
	public void setFechaUltimoParto(LocalDate fechaUltimoParto) {
		this.fechaUltimoParto = fechaUltimoParto;
	}
	public LocalDate getFechaInicioVidaSexual() {
		return fechaInicioVidaSexual;
	}
	public void setFechaInicioVidaSexual(LocalDate fechaInicioVidaSexual) {
		this.fechaInicioVidaSexual = fechaInicioVidaSexual;
	}
	public int getTotalHijosVivos() {
		return totalHijosVivos;
	}
	public void setTotalHijosVivos(int totalHijosVivos) {
		this.totalHijosVivos = totalHijosVivos;
	}
	public int getNumGestas() {
		return numGestas;
	}
	public void setNumGestas(int numGestas) {
		this.numGestas = numGestas;
	}
	public int getNumAbortos() {
		return numAbortos;
	}
	public void setNumAbortos(int numAbortos) {
		this.numAbortos = numAbortos;
	}
	public int getNumPartos() {
		return numPartos;
	}
	public void setNumPartos(int numPartos) {
		this.numPartos = numPartos;
	}
	
	
}
