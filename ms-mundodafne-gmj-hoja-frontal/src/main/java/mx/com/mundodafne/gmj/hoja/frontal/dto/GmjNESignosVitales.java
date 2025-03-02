package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

public class GmjNESignosVitales implements Serializable {
	private String temperatura;
	private String frecuenciaCardiaca;
	private String presionDiast;
	private String presionSist;
	private boolean cuentaConAyuno;
	private Integer oxigenacion;
	private Integer talla;
	private Double peso;
	private String habitusExterior;
	private String padecimientoActual;
	/**
	 * @return the temperatura
	 */
	public String getTemperatura() {
		return temperatura;
	}
	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	/**
	 * @return the frecuenciaCardiaca
	 */
	public String getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}
	/**
	 * @param frecuenciaCardiaca the frecuenciaCardiaca to set
	 */
	public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}
	/**
	 * @return the presionDiast
	 */
	public String getPresionDiast() {
		return presionDiast;
	}
	/**
	 * @param presionDiast the presionDiast to set
	 */
	public void setPresionDiast(String presionDiast) {
		this.presionDiast = presionDiast;
	}
	/**
	 * @return the presionSist
	 */
	public String getPresionSist() {
		return presionSist;
	}
	/**
	 * @param presionSist the presionSist to set
	 */
	public void setPresionSist(String presionSist) {
		this.presionSist = presionSist;
	}
	/**
	 * @return the cuentaConAyuno
	 */
	public boolean isCuentaConAyuno() {
		return cuentaConAyuno;
	}
	/**
	 * @param cuentaConAyuno the cuentaConAyuno to set
	 */
	public void setCuentaConAyuno(boolean cuentaConAyuno) {
		this.cuentaConAyuno = cuentaConAyuno;
	}
	/**
	 * @return the oxigenacion
	 */
	public Integer getOxigenacion() {
		return oxigenacion;
	}
	/**
	 * @param oxigenacion the oxigenacion to set
	 */
	public void setOxigenacion(Integer oxigenacion) {
		this.oxigenacion = oxigenacion;
	}
	/**
	 * @return the talla
	 */
	public Integer getTalla() {
		return talla;
	}
	/**
	 * @param talla the talla to set
	 */
	public void setTalla(Integer talla) {
		this.talla = talla;
	}
	/**
	 * @return the peso
	 */
	public Double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	/**
	 * @return the habitusExterior
	 */
	public String getHabitusExterior() {
		return habitusExterior;
	}
	/**
	 * @param habitusExterior the habitusExterior to set
	 */
	public void setHabitusExterior(String habitusExterior) {
		this.habitusExterior = habitusExterior;
	}
	/**
	 * @return the padecimientoActual
	 */
	public String getPadecimientoActual() {
		return padecimientoActual;
	}
	/**
	 * @param padecimientoActual the padecimientoActual to set
	 */
	public void setPadecimientoActual(String padecimientoActual) {
		this.padecimientoActual = padecimientoActual;
	}
	
	
	
}
