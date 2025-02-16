/**
 * 
 */
package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

/**
 * 
 */
public class GmjFrontalRespSalidaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3545350382010130037L;
	private String[] mensajes;
	private boolean exito;
	/**
	 * @return the mensajes
	 */
	public String[] getMensajes() {
		return mensajes;
	}
	/**
	 * @param mensajes the mensajes to set
	 */
	public void setMensajes(String[] mensajes) {
		this.mensajes = mensajes;
	}
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
}