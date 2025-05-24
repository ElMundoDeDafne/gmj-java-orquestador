package mx.com.mundodafne.ms.pacientes.gmj.dto;

import java.io.Serializable;

/**
 * DTO modelo para respuesta de busqueda de pacientes.
 * @author ELDD
 * */
public class GmjBusquedaPacientesInDTO implements Serializable {
	
	private boolean exito;
	private String folio;
	private String nombre;
	private String localidad;
	private String curp;
	private Byte edad;
	private String especialidad;
	private String medicoTratante;
	/**
	 * @return the exito
	 */
	public boolean isExito() {
		return exito;
	}
	/**
	 * @param exito the exito to set
	 */
	public void setExito(boolean exito) {
		this.exito = exito;
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
