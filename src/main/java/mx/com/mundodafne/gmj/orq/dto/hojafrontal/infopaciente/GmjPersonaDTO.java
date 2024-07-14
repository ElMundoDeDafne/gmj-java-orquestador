package mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente;

import java.io.Serializable;

public class GmjPersonaDTO implements Serializable{
	private String nombreUno;
	private String nombreDos;
	private String apellidoPat;
	private String apellidoMat;
	private int edad;
	private char genero;
	private char esDerechoHabiente;
	private char cuentaConCartilla;
	public String getNombreUno() {
		return nombreUno;
	}
	public void setNombreUno(String nombreUno) {
		this.nombreUno = nombreUno;
	}
	public String getNombreDos() {
		return nombreDos;
	}
	public void setNombreDos(String nombreDos) {
		this.nombreDos = nombreDos;
	}
	public String getApellidoPat() {
		return apellidoPat;
	}
	public void setApellidoPat(String apellidoPat) {
		this.apellidoPat = apellidoPat;
	}
	public String getApellidoMat() {
		return apellidoMat;
	}
	public void setApellidoMat(String apellidoMat) {
		this.apellidoMat = apellidoMat;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public char getEsDerechoHabiente() {
		return esDerechoHabiente;
	}
	public void setEsDerechoHabiente(char esDerechoHabiente) {
		this.esDerechoHabiente = esDerechoHabiente;
	}
	public char getCuentaConCartilla() {
		return cuentaConCartilla;
	}
	public void setCuentaConCartilla(char cuentaConCartilla) {
		this.cuentaConCartilla = cuentaConCartilla;
	}
	
}
