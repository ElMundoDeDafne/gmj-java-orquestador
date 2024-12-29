package mx.com.mundodafne.ms.reportes.gmj.dto;

import java.util.List;

public class RepSalidaReportesDTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2493191069225754792L;
	private String base64;
	private List<String> mensajes;
	private boolean exito;
	
	/**
	 * @return the base64
	 */
	public String getBase64() {
		return base64;
	}
	/**
	 * @param base64 the base64 to set
	 */
	public void setBase64(String base64) {
		this.base64 = base64;
	}
	/**
	 * @return the mensajes
	 */
	public List<String> getMensajes() {
		return mensajes;
	}
	/**
	 * @param mensajes the mensajes to set
	 */
	public void setMensajes(List<String> mensajes) {
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
