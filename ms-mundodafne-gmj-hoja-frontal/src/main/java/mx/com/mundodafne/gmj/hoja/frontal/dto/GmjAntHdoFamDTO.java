/**
 * 
 */
package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

/**
 * 
 */
public class GmjAntHdoFamDTO implements Serializable {
	private boolean desconoce;
	private String familiar;
	private String parentesco;
	private String morbilidadFamiliar;
	/**
	 * @return the desconoce
	 */
	public boolean isDesconoce() {
		return desconoce;
	}
	/**
	 * @param desconoce the desconoce to set
	 */
	public void setDesconoce(boolean desconoce) {
		this.desconoce = desconoce;
	}
	/**
	 * @return the familiar
	 */
	public String getFamiliar() {
		return familiar;
	}
	/**
	 * @param familiar the familiar to set
	 */
	public void setFamiliar(String familiar) {
		this.familiar = familiar;
	}
	/**
	 * @return the parentesco
	 */
	public String getParentesco() {
		return parentesco;
	}
	/**
	 * @param parentesco the parentesco to set
	 */
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	/**
	 * @return the morbilidadFamiliar
	 */
	public String getMorbilidadFamiliar() {
		return morbilidadFamiliar;
	}
	/**
	 * @param morbilidadFamiliar the morbilidadFamiliar to set
	 */
	public void setMorbilidadFamiliar(String morbilidadFamiliar) {
		this.morbilidadFamiliar = morbilidadFamiliar;
	}
	
	
}
