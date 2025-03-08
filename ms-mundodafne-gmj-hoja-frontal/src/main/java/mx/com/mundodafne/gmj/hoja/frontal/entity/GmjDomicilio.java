package mx.com.mundodafne.gmj.hoja.frontal.entity;

import jakarta.persistence.Entity;

//@Entity
public class GmjDomicilio {
	
	private Long idDomicilioPersona;
	private String codigoPostal;
	private String callePrincipal;
	private String entidad;
	private String localidad;
	private String municipio;
	private String entreCalles1;
	private String entreCalles2;
	
	public Long getIdDomicilioPersona() {
		return idDomicilioPersona;
	}
	public void setIdDomicilioPersona(Long idDomicilioPersona) {
		this.idDomicilioPersona = idDomicilioPersona;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEntreCalles1() {
		return entreCalles1;
	}
	public void setEntreCalles1(String entreCalles1) {
		this.entreCalles1 = entreCalles1;
	}
	public String getEntreCalles2() {
		return entreCalles2;
	}
	public void setEntreCalles2(String entreCalles2) {
		this.entreCalles2 = entreCalles2;
	}
}
