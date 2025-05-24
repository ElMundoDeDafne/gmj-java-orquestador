package mx.com.mundodafne.ms.pacientes.gmj.entity;

import java.time.LocalDateTime;

public class PerPacienteEntity {
	private Long idPaciente;
	private String motivoConsulta;
	private LocalDateTime fechaIngreso;
	private LocalDateTime fechaAlta;
//	private PerPersonaEntity perPersona;
	private double peso;
	private double imc;
//	private PerHistorialClinicoEntity perHistorialClinico;
	private String pathSistema;
	private String folio;
	private LocalDateTime fechaProximaCita;
	private LocalDateTime fechaUltimaVisita;
	/**
	 * @return the idPaciente
	 */
	public Long getIdPaciente() {
		return idPaciente;
	}
	/**
	 * @param idPaciente the idPaciente to set
	 */
	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}
	/**
	 * @return the motivoConsulta
	 */
	public String getMotivoConsulta() {
		return motivoConsulta;
	}
	/**
	 * @param motivoConsulta the motivoConsulta to set
	 */
	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}
	/**
	 * @return the fechaIngreso
	 */
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	/**
	 * @return the fechaAlta
	 */
	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}
	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @return the imc
	 */
	public double getImc() {
		return imc;
	}
	/**
	 * @param imc the imc to set
	 */
	public void setImc(double imc) {
		this.imc = imc;
	}
	/**
	 * @return the pathSistema
	 */
	public String getPathSistema() {
		return pathSistema;
	}
	/**
	 * @param pathSistema the pathSistema to set
	 */
	public void setPathSistema(String pathSistema) {
		this.pathSistema = pathSistema;
	}
	/**
	 * @return the folio
	 */
	public String getFolio() {
		return folio;
	}
	/**
	 * @param folio the folio to set
	 */
	public void setFolio(String folio) {
		this.folio = folio;
	}
	/**
	 * @return the fechaProximaCita
	 */
	public LocalDateTime getFechaProximaCita() {
		return fechaProximaCita;
	}
	/**
	 * @param fechaProximaCita the fechaProximaCita to set
	 */
	public void setFechaProximaCita(LocalDateTime fechaProximaCita) {
		this.fechaProximaCita = fechaProximaCita;
	}
	/**
	 * @return the fechaUltimaVisita
	 */
	public LocalDateTime getFechaUltimaVisita() {
		return fechaUltimaVisita;
	}
	/**
	 * @param fechaUltimaVisita the fechaUltimaVisita to set
	 */
	public void setFechaUltimaVisita(LocalDateTime fechaUltimaVisita) {
		this.fechaUltimaVisita = fechaUltimaVisita;
	}
	
	
}
