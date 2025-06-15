package mx.com.mundodafne.ms.pacientes.gmj.dto;

import java.io.Serializable;

/**
 * DTO modelo para respuesta de busqueda de pacientes.
 * @author ELDD
 * */
public class GmjBusquedaPacientesInDTO implements Serializable {
	
	private String folio;
	private String nombre;
	private String localidad;
	private String curp;
	private String especialidad;
	private String medicoTratante;
	
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
}
