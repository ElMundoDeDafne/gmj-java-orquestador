package mx.com.mundodafne.gmj.orq.dto.notamedica;

import java.io.Serializable;

public class GmjNotaMedicaPacienteDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5155388444267657960L;
	private String cedulaProfesional;
	private String exploracion;
	private String hallazgos;
	private String recomendaciones;
	private String impresionDiagnostica;
	private String realizo;
	private String tratamiento;
	private String analisisYComentarios;
	public String getCedulaProfesional() {
		return cedulaProfesional;
	}
	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}
	public String getExploracion() {
		return exploracion;
	}
	public void setExploracion(String exploracion) {
		this.exploracion = exploracion;
	}
	public String getHallazgos() {
		return hallazgos;
	}
	public void setHallazgos(String hallazgos) {
		this.hallazgos = hallazgos;
	}
	public String getRecomendaciones() {
		return recomendaciones;
	}
	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
	public String getImpresionDiagnostica() {
		return impresionDiagnostica;
	}
	public void setImpresionDiagnostica(String impresionDiagnostica) {
		this.impresionDiagnostica = impresionDiagnostica;
	}
	public String getRealizo() {
		return realizo;
	}
	public void setRealizo(String realizo) {
		this.realizo = realizo;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	public String getAnalisisYComentarios() {
		return analisisYComentarios;
	}
	public void setAnalisisYComentarios(String analisisYComentarios) {
		this.analisisYComentarios = analisisYComentarios;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
