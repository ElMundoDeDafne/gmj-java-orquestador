package mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente;

import java.time.LocalDate;

public class GmjInformacionPacienteDTO implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2692725900770445544L;
	private String folio;
	private String tipoConsulta;
	private String nombrePropio1;
	private String nombrePropio2;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nacionalidad;
	private byte edad;
	private String genero;
	private LocalDate fechaNacimiento;
	private String curp;
	private String motivoConsulta;
	private String cuentaConCartilla;
	byte meses;
	/**
	 * @return the tipoConsulta
	 */
	public String getTipoConsulta() {
		return tipoConsulta;
	}
	/**
	 * @param tipoConsulta the tipoConsulta to set
	 */
	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
	/**
	 * @return the nombrePropio1
	 */
	public String getNombrePropio1() {
		return nombrePropio1;
	}
	/**
	 * @param nombrePropio1 the nombrePropio1 to set
	 */
	public void setNombrePropio1(String nombrePropio1) {
		this.nombrePropio1 = nombrePropio1;
	}
	/**
	 * @return the nombrePropio2
	 */
	public String getNombrePropio2() {
		return nombrePropio2;
	}
	/**
	 * @param nombrePropio2 the nombrePropio2 to set
	 */
	public void setNombrePropio2(String nombrePropio2) {
		this.nombrePropio2 = nombrePropio2;
	}
	/**
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	/**
	 * @param apellidoPaterno the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	/**
	 * @param apellidoMaterno the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * @return the edad
	 */
	public byte getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}
	/**
	 * @param curp the curp to set
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}
	/**
	 * @return the motivoConsulta
	 */
	public String getMotivoConsulta() {
		return motivoConsulta;
	}
	/**
	 * @param motivoConsulta the motivoConsulta to set
	 */
	public void setMotivoConsulta(String motivoConsulta) {
		this.motivoConsulta = motivoConsulta;
	}
	/**
	 * @return the cuentaConCartilla
	 */
	public String getCuentaConCartilla() {
		return cuentaConCartilla;
	}
	/**
	 * @param cuentaConCartilla the cuentaConCartilla to set
	 */
	public void setCuentaConCartilla(String cuentaConCartilla) {
		this.cuentaConCartilla = cuentaConCartilla;
	}
	/**
	 * @return the meses
	 */
	public byte getMeses() {
		return meses;
	}
	/**
	 * @param meses the meses to set
	 */
	public void setMeses(byte meses) {
		this.meses = meses;
	}
	/**
	 * @return the folio
	 */
	public String getFolio() {
		return folio;
	}
	/**
	 * @param folio the folio to set
	 */
	public void setFolio(String folio) {
		this.folio = folio;
	}
	
}
