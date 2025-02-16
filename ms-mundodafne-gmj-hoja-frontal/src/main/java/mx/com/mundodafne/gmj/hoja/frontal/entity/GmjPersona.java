package mx.com.mundodafne.gmj.hoja.frontal.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class GmjPersona {
	private Long idPaciente;
	private String nombrePropio1;
	private String nombrePropio2;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Integer edad;
	private String genero;
	private LocalDate fechaNacimiento;
	private String curp;
	private String ocupacion;
	public String getNombrePropio1() {
		return nombrePropio1;
	}
	public void setNombrePropio1(String nombrePropio1) {
		this.nombrePropio1 = nombrePropio1;
	}
	public String getNombrePropio2() {
		return nombrePropio2;
	}
	public void setNombrePropio2(String nombrePropio2) {
		this.nombrePropio2 = nombrePropio2;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public Long getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	
}
