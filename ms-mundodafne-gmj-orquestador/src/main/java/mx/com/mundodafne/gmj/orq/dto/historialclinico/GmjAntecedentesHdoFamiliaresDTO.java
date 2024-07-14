package mx.com.mundodafne.gmj.orq.dto.historialclinico;

import java.io.Serializable;

public class GmjAntecedentesHdoFamiliaresDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -829598063054947523L;
	private String familiar;
	private String parentesco;
	private String morbilidadFamiliar;
	
	public String getFamiliar() {
		return familiar;
	}
	public void setFamiliar(String familiar) {
		this.familiar = familiar;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	public String getMorbilidadFamiliar() {
		return morbilidadFamiliar;
	}
	public void setMorbilidadFamiliar(String morbilidadFamiliar) {
		this.morbilidadFamiliar = morbilidadFamiliar;
	}
	
	
}
