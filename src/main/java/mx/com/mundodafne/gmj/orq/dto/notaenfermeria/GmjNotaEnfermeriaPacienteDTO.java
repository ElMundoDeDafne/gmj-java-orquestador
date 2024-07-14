package mx.com.mundodafne.gmj.orq.dto.notaenfermeria;

public class GmjNotaEnfermeriaPacienteDTO implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6974111988462607667L;
	private double presionSist;
	private double presionDiast;
	private int frecuenciaResp;
	private int frecuenciaCard;
	private char ayuno;
	private double temperatura;
	private String habitusExterior;
	private String padecimientoActual;
	private String accionesDxEnf;
	private String accionesEnf;
	private String realizo;
	private String cedulaProfesional;
	
	public double getPresionSist() {
		return presionSist;
	}
	public void setPresionSist(double presionSist) {
		this.presionSist = presionSist;
	}
	public double getPresionDiast() {
		return presionDiast;
	}
	public void setPresionDiast(double presionDiast) {
		this.presionDiast = presionDiast;
	}
	public int getFrecuenciaResp() {
		return frecuenciaResp;
	}
	public void setFrecuenciaResp(int frecuenciaResp) {
		this.frecuenciaResp = frecuenciaResp;
	}
	public int getFrecuenciaCard() {
		return frecuenciaCard;
	}
	public void setFrecuenciaCard(int frecuenciaCard) {
		this.frecuenciaCard = frecuenciaCard;
	}
	public char getAyuno() {
		return ayuno;
	}
	public void setAyuno(char ayuno) {
		this.ayuno = ayuno;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public String getHabitusExterior() {
		return habitusExterior;
	}
	public void setHabitusExterior(String habitusExterior) {
		this.habitusExterior = habitusExterior;
	}
	public String getPadecimientoActual() {
		return padecimientoActual;
	}
	public void setPadecimientoActual(String padecimientoActual) {
		this.padecimientoActual = padecimientoActual;
	}
	public String getAccionesDxEnf() {
		return accionesDxEnf;
	}
	public void setAccionesDxEnf(String accionesDxEnf) {
		this.accionesDxEnf = accionesDxEnf;
	}
	public String getAccionesEnf() {
		return accionesEnf;
	}
	public void setAccionesEnf(String accionesEnf) {
		this.accionesEnf = accionesEnf;
	}
	public String getRealizo() {
		return realizo;
	}
	public void setRealizo(String realizo) {
		this.realizo = realizo;
	}
	public String getCedulaProfesional() {
		return cedulaProfesional;
	}
	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}
	
}
