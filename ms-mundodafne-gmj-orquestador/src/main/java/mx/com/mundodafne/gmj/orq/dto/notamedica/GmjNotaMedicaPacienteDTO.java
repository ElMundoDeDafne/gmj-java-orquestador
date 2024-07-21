package mx.com.mundodafne.gmj.orq.dto.notamedica;

import java.io.Serializable;

public class GmjNotaMedicaPacienteDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5155388444267657960L;
	private String cedulaProfNM;
	private String exploracion;
	private String hallazgos;
	private String recomendaciones;
	private String impresionDiagnostica;
	private String realizoNM;
	private String tratamiento;
	private String analisisYComentarios;
	/**
	 * @return the cedulaProfNM
	 */
	public String getCedulaProfNM() {
		return cedulaProfNM;
	}
	/**
	 * @param cedulaProfNM the cedulaProfNM to set
	 */
	public void setCedulaProfNM(String cedulaProfNM) {
		this.cedulaProfNM = cedulaProfNM;
	}
	/**
	 * @return the exploracion
	 */
	public String getExploracion() {
		return exploracion;
	}
	/**
	 * @param exploracion the exploracion to set
	 */
	public void setExploracion(String exploracion) {
		this.exploracion = exploracion;
	}
	/**
	 * @return the hallazgos
	 */
	public String getHallazgos() {
		return hallazgos;
	}
	/**
	 * @param hallazgos the hallazgos to set
	 */
	public void setHallazgos(String hallazgos) {
		this.hallazgos = hallazgos;
	}
	/**
	 * @return the recomendaciones
	 */
	public String getRecomendaciones() {
		return recomendaciones;
	}
	/**
	 * @param recomendaciones the recomendaciones to set
	 */
	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
	/**
	 * @return the impresionDiagnostica
	 */
	public String getImpresionDiagnostica() {
		return impresionDiagnostica;
	}
	/**
	 * @param impresionDiagnostica the impresionDiagnostica to set
	 */
	public void setImpresionDiagnostica(String impresionDiagnostica) {
		this.impresionDiagnostica = impresionDiagnostica;
	}
	/**
	 * @return the realizoNM
	 */
	public String getRealizoNM() {
		return realizoNM;
	}
	/**
	 * @param realizoNM the realizoNM to set
	 */
	public void setRealizoNM(String realizoNM) {
		this.realizoNM = realizoNM;
	}
	/**
	 * @return the tratamiento
	 */
	public String getTratamiento() {
		return tratamiento;
	}
	/**
	 * @param tratamiento the tratamiento to set
	 */
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	/**
	 * @return the analisisYComentarios
	 */
	public String getAnalisisYComentarios() {
		return analisisYComentarios;
	}
	/**
	 * @param analisisYComentarios the analisisYComentarios to set
	 */
	public void setAnalisisYComentarios(String analisisYComentarios) {
		this.analisisYComentarios = analisisYComentarios;
	}	
	
	
}
