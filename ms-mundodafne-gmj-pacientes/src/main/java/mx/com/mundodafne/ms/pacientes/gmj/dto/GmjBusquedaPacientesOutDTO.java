package mx.com.mundodafne.ms.pacientes.gmj.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO de respuesta de busqueda de pacientes
 * */
public class GmjBusquedaPacientesOutDTO implements Serializable {
	
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String curp;
	private String localidad;
	private Byte edad;
	private String especialidad;
	private byte[] receta;
	private String pathSistema;
	private String medicoTratante;
	private LocalDateTime fechaUltimaVisita;
	
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	/**
	 * @param apellidoPaterno the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	/**
	 * @param apellidoMaterno the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}
	/**
	 * @param curp the curp to set
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}
	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}
	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	/**
	 * @return the edad
	 */
	public Byte getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Byte edad) {
		this.edad = edad;
	}
	/**
	 * @return the especialidad
	 */
	public String getEspecialidad() {
		return especialidad;
	}
	/**
	 * @param especialidad the especialidad to set
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	/**
	 * @return the receta
	 */
	public byte[] getReceta() {
		return receta;
	}
	/**
	 * @param receta the receta to set
	 */
	public void setReceta(byte[] receta) {
		this.receta = receta;
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
	 * @return the medicoTratante
	 */
	public String getMedicoTratante() {
		return medicoTratante;
	}
	/**
	 * @param medicoTratante the medicoTratante to set
	 */
	public void setMedicoTratante(String medicoTratante) {
		this.medicoTratante = medicoTratante;
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
