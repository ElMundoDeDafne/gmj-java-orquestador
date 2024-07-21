package mx.com.mundodafne.gmj.orq.dto.notaenfermeria;

import java.util.List;

public class GmjNotaEnfermeriaPacienteDTO implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6974111988462607667L;
	private String accionesDxEnf;
	private String accionesNEnf;
	private String cedulaProfNEnf;
	private String realizoNEnf;
	private String resultadosNEnf;
	private List<SignosVitales> signosVitales;
		
}

class SignosVitales {
	private byte temperatura;
	private byte frecuenciaCardiaca;
	private byte presionDiast;
	private byte presionSist;
	private String cuentaConAyuno;
	private byte oxigenacion;
	private String habitusExterior;
	private String padecimientoActual;
	/**
	 * @return the temperatura
	 */
	public byte getTemperatura() {
		return temperatura;
	}
	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(byte temperatura) {
		this.temperatura = temperatura;
	}
	/**
	 * @return the frecuenciaCardiaca
	 */
	public byte getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}
	/**
	 * @param frecuenciaCardiaca the frecuenciaCardiaca to set
	 */
	public void setFrecuenciaCardiaca(byte frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}
	/**
	 * @return the presionDiast
	 */
	public byte getPresionDiast() {
		return presionDiast;
	}
	/**
	 * @param presionDiast the presionDiast to set
	 */
	public void setPresionDiast(byte presionDiast) {
		this.presionDiast = presionDiast;
	}
	/**
	 * @return the presionSist
	 */
	public byte getPresionSist() {
		return presionSist;
	}
	/**
	 * @param presionSist the presionSist to set
	 */
	public void setPresionSist(byte presionSist) {
		this.presionSist = presionSist;
	}
	/**
	 * @return the cuentaConAyuno
	 */
	public String getCuentaConAyuno() {
		return cuentaConAyuno;
	}
	/**
	 * @param cuentaConAyuno the cuentaConAyuno to set
	 */
	public void setCuentaConAyuno(String cuentaConAyuno) {
		this.cuentaConAyuno = cuentaConAyuno;
	}
	/**
	 * @return the oxigenacion
	 */
	public byte getOxigenacion() {
		return oxigenacion;
	}
	/**
	 * @param oxigenacion the oxigenacion to set
	 */
	public void setOxigenacion(byte oxigenacion) {
		this.oxigenacion = oxigenacion;
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