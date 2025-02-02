package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

public class GmjDomicilioPacienteDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigoPostal;
	private String callePrincipal;
	private String entidad;
	private String localidad;
	private String municipio;
	private String entreCalles1;
	private String entreCalles2;
	/**
	 * @return the codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}
	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	/**
	 * @return the callePrincipal
	 */
	public String getCallePrincipal() {
		return callePrincipal;
	}
	/**
	 * @param callePrincipal the callePrincipal to set
	 */
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	/**
	 * @return the entidad
	 */
	public String getEntidad() {
		return entidad;
	}
	/**
	 * @param entidad the entidad to set
	 */
	public void setEntidad(String entidad) {
		this.entidad = entidad;
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
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}
	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	/**
	 * @return the entreCalles1
	 */
	public String getEntreCalles1() {
		return entreCalles1;
	}
	/**
	 * @param entreCalles1 the entreCalles1 to set
	 */
	public void setEntreCalles1(String entreCalles1) {
		this.entreCalles1 = entreCalles1;
	}
	/**
	 * @return the entreCalles2
	 */
	public String getEntreCalles2() {
		return entreCalles2;
	}
	/**
	 * @param entreCalles2 the entreCalles2 to set
	 */
	public void setEntreCalles2(String entreCalles2) {
		this.entreCalles2 = entreCalles2;
	}
}
