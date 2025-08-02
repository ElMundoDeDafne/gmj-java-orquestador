package mx.com.mundodafne.ms.catalogos.gmj.dto;

import java.time.LocalDate;

public class GmjDatosPersonaDTO {
	private String nombrePropioUno;
	private String nombrePropioDos;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private LocalDate fechaNacimiento;
	private String sexo;
	private String curp;
	private String religion;
	private String ocupacion;
	
	/**
	 * @return the nombrePropioUno
	 */
	public String getNombrePropioUno() {
		return nombrePropioUno;
	}
	/**
	 * @param nombrePropioUno the nombrePropioUno to set
	 */
	public void setNombrePropioUno(String nombrePropioUno) {
		this.nombrePropioUno = nombrePropioUno;
	}
	/**
	 * @return the nombrePropioDos
	 */
	public String getNombrePropioDos() {
		return nombrePropioDos;
	}
	/**
	 * @param nombrePropioDos the nombrePropioDos to set
	 */
	public void setNombrePropioDos(String nombrePropioDos) {
		this.nombrePropioDos = nombrePropioDos;
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
	
	
}
