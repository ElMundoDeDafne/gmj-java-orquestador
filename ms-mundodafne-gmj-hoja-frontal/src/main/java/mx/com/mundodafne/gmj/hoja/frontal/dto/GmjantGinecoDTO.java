package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

public class GmjantGinecoDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1901036995000177394L;
	private String fechaUltimaCitologia;
	private String fechaUltimaRegla;
	private String fechaUltimoParto;
	private Integer hijosVivos;
	private Integer numAborts;
	private Integer numCesareas;
	private Integer numPartos;
	private String inicioVidaSexual;
	/**
	 * @return the fechaUltimaCitologia
	 */
	public String getFechaUltimaCitologia() {
		return fechaUltimaCitologia;
	}
	/**
	 * @param fechaUltimaCitologia the fechaUltimaCitologia to set
	 */
	public void setFechaUltimaCitologia(String fechaUltimaCitologia) {
		this.fechaUltimaCitologia = fechaUltimaCitologia;
	}
	/**
	 * @return the fechaUltimaRegla
	 */
	public String getFechaUltimaRegla() {
		return fechaUltimaRegla;
	}
	/**
	 * @param fechaUltimaRegla the fechaUltimaRegla to set
	 */
	public void setFechaUltimaRegla(String fechaUltimaRegla) {
		this.fechaUltimaRegla = fechaUltimaRegla;
	}
	/**
	 * @return the fechaUltimoParto
	 */
	public String getFechaUltimoParto() {
		return fechaUltimoParto;
	}
	/**
	 * @param fechaUltimoParto the fechaUltimoParto to set
	 */
	public void setFechaUltimoParto(String fechaUltimoParto) {
		this.fechaUltimoParto = fechaUltimoParto;
	}
	/**
	 * @return the hijosVivos
	 */
	public Integer getHijosVivos() {
		return hijosVivos;
	}
	/**
	 * @param hijosVivos the hijosVivos to set
	 */
	public void setHijosVivos(Integer hijosVivos) {
		this.hijosVivos = hijosVivos;
	}
	/**
	 * @return the numAborts
	 */
	public Integer getNumAborts() {
		return numAborts;
	}
	/**
	 * @param numAborts the numAborts to set
	 */
	public void setNumAborts(Integer numAborts) {
		this.numAborts = numAborts;
	}
	/**
	 * @return the numCesareas
	 */
	public Integer getNumCesareas() {
		return numCesareas;
	}
	/**
	 * @param numCesareas the numCesareas to set
	 */
	public void setNumCesareas(Integer numCesareas) {
		this.numCesareas = numCesareas;
	}
	/**
	 * @return the numPartos
	 */
	public Integer getNumPartos() {
		return numPartos;
	}
	/**
	 * @param numPartos the numPartos to set
	 */
	public void setNumPartos(Integer numPartos) {
		this.numPartos = numPartos;
	}
	/**
	 * @return the inicioVidaSexual
	 */
	public String getInicioVidaSexual() {
		return inicioVidaSexual;
	}
	/**
	 * @param inicioVidaSexual the inicioVidaSexual to set
	 */
	public void setInicioVidaSexual(String inicioVidaSexual) {
		this.inicioVidaSexual = inicioVidaSexual;
	}
	
	

}
