package mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente;

import java.io.Serializable;

public class GmjDomicilioPacienteDTO implements Serializable{
	private String codigoPostal;
	private String callePrincipal;
	private String entreCallesUno;
	private String entreCallesDos;
	private String entidad;
	private String localidad;
	private String municipio;
	private String numeroCalle;
	private String manzana;
	private String vivienda;
	
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
	public String getEntreCallesUno() {
		return entreCallesUno;
	}
	public void setEntreCallesUno(String entreCallesUno) {
		this.entreCallesUno = entreCallesUno;
	}
	public String getEntreCallesDos() {
		return entreCallesDos;
	}
	public void setEntreCallesDos(String entreCallesDos) {
		this.entreCallesDos = entreCallesDos;
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
	public String getNumeroCalle() {
		return numeroCalle;
	}
	public void setNumeroCalle(String numeroCalle) {
		this.numeroCalle = numeroCalle;
	}
	public String getManzana() {
		return manzana;
	}
	public void setManzana(String manzana) {
		this.manzana = manzana;
	}
	public String getVivienda() {
		return vivienda;
	}
	public void setVivienda(String vivienda) {
		this.vivienda = vivienda;
	}
	
	
}
