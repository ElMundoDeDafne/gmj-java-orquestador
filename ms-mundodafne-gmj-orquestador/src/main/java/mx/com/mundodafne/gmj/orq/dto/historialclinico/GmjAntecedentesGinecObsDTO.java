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
	private LocalDate inicioVidaSexual;
	private byte hijosVivos;
	private byte numGestas;
	private byte numAborts;
	private byte numPartos;
	private byte numCesareas;
	/**
	 * @return the fechaUltimaCitologia
	 */
	public LocalDate getFechaUltimaCitologia() {
		return fechaUltimaCitologia;
	}
	/**
	 * @param fechaUltimaCitologia the fechaUltimaCitologia to set
	 */
	public void setFechaUltimaCitologia(LocalDate fechaUltimaCitologia) {
		this.fechaUltimaCitologia = fechaUltimaCitologia;
	}
	/**
	 * @return the fechaUltimaRegla
	 */
	public LocalDate getFechaUltimaRegla() {
		return fechaUltimaRegla;
	}
	/**
	 * @param fechaUltimaRegla the fechaUltimaRegla to set
	 */
	public void setFechaUltimaRegla(LocalDate fechaUltimaRegla) {
		this.fechaUltimaRegla = fechaUltimaRegla;
	}
	/**
	 * @return the fechaUltimoParto
	 */
	public LocalDate getFechaUltimoParto() {
		return fechaUltimoParto;
	}
	/**
	 * @param fechaUltimoParto the fechaUltimoParto to set
	 */
	public void setFechaUltimoParto(LocalDate fechaUltimoParto) {
		this.fechaUltimoParto = fechaUltimoParto;
	}
	/**
	 * @return the inicioVidaSexual
	 */
	public LocalDate getInicioVidaSexual() {
		return inicioVidaSexual;
	}
	/**
	 * @param inicioVidaSexual the inicioVidaSexual to set
	 */
	public void setInicioVidaSexual(LocalDate inicioVidaSexual) {
		this.inicioVidaSexual = inicioVidaSexual;
	}
	/**
	 * @return the hijosVivos
	 */
	public byte getHijosVivos() {
		return hijosVivos;
	}
	/**
	 * @param hijosVivos the hijosVivos to set
	 */
	public void setHijosVivos(byte hijosVivos) {
		this.hijosVivos = hijosVivos;
	}
	/**
	 * @return the numGestas
	 */
	public byte getNumGestas() {
		return numGestas;
	}
	/**
	 * @param numGestas the numGestas to set
	 */
	public void setNumGestas(byte numGestas) {
		this.numGestas = numGestas;
	}
	/**
	 * @return the numAborts
	 */
	public byte getNumAborts() {
		return numAborts;
	}
	/**
	 * @param numAborts the numAborts to set
	 */
	public void setNumAborts(byte numAborts) {
		this.numAborts = numAborts;
	}
	/**
	 * @return the numPartos
	 */
	public byte getNumPartos() {
		return numPartos;
	}
	/**
	 * @param numPartos the numPartos to set
	 */
	public void setNumPartos(byte numPartos) {
		this.numPartos = numPartos;
	}
	/**
	 * @return the numCesareas
	 */
	public byte getNumCesareas() {
		return numCesareas;
	}
	/**
	 * @param numCesareas the numCesareas to set
	 */
	public void setNumCesareas(byte numCesareas) {
		this.numCesareas = numCesareas;
	}
	
}
