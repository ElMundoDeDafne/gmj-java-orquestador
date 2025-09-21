/**
 * 
 */
package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

/**
 * 
 */
public class GmjNotaEnfermeriaDTO implements Serializable {
	private String accionesDxEnf;
	private String accionesNEnf;
	private String cedulaProfNEnf;
	private String realizoNEnf;
	private String resultadosNEnf;
	private GmjNESignosVitales signosVitales;
	/**
	 * @return the accionesDxEnf
	 */
	public String getAccionesDxEnf() {
		return accionesDxEnf;
	}
	/**
	 * @param accionesDxEnf the accionesDxEnf to set
	 */
	public void setAccionesDxEnf(String accionesDxEnf) {
		this.accionesDxEnf = accionesDxEnf;
	}
	/**
	 * @return the accionesNEnf
	 */
	public String getAccionesNEnf() {
		return accionesNEnf;
	}
	/**
	 * @param accionesNEnf the accionesNEnf to set
	 */
	public void setAccionesNEnf(String accionesNEnf) {
		this.accionesNEnf = accionesNEnf;
	}
	/**
	 * @return the cedulaProfNEnf
	 */
	public String getCedulaProfNEnf() {
		return cedulaProfNEnf;
	}
	/**
	 * @param cedulaProfNEnf the cedulaProfNEnf to set
	 */
	public void setCedulaProfNEnf(String cedulaProfNEnf) {
		this.cedulaProfNEnf = cedulaProfNEnf;
	}
	/**
	 * @return the realizoNEnf
	 */
	public String getRealizoNEnf() {
		return realizoNEnf;
	}
	/**
	 * @param realizoNEnf the realizoNEnf to set
	 */
	public void setRealizoNEnf(String realizoNEnf) {
		this.realizoNEnf = realizoNEnf;
	}
	/**
	 * @return the resultadosNEnf
	 */
	public String getResultadosNEnf() {
		return resultadosNEnf;
	}
	/**
	 * @param resultadosNEnf the resultadosNEnf to set
	 */
	public void setResultadosNEnf(String resultadosNEnf) {
		this.resultadosNEnf = resultadosNEnf;
	}
	/**
	 * @return the signosVitales
	 */
	public GmjNESignosVitales getSignosVitales() {
		return signosVitales;
	}
	/**
	 * @param signosVitales the signosVitales to set
	 */
	public void setSignosVitales(GmjNESignosVitales signosVitales) {
		this.signosVitales = signosVitales;
	}
	
	
}
