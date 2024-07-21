/**
 * 
 */
package mx.com.mundodafne.ms.pacientes.gmj.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * 
 */
public class GmjPacientesPacienteDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2185748945704400541L;
	private long idPaciente;
	private String nombrePropio;
	private String nombrePropio2;
	private LocalDate fechaRegistro;
	private char sexoReferido;
	private String CURP;
	private String estadoCivil;
	private String NSS;
	private String ocupacion;
	private String derechoHabiencia;
	private char sexoAlNacer;
	private String genero;
	private List<GmjPacientesDomicilioPacienteDTO> domiciliosPaciente;
	private String apellidoPaterno;
	private String apellidoMaterno;
	public long getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombrePropio() {
		return nombrePropio;
	}
	public void setNombrePropio(String nombrePropio) {
		this.nombrePropio = nombrePropio;
	}
	public String getNombrePropio2() {
		return nombrePropio2;
	}
	public void setNombrePropio2(String nombrePropio2) {
		this.nombrePropio2 = nombrePropio2;
	}
	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public char getSexoReferido() {
		return sexoReferido;
	}
	public void setSexoReferido(char sexoReferido) {
		this.sexoReferido = sexoReferido;
	}
	public String getCURP() {
		return CURP;
	}
	public void setCURP(String cURP) {
		CURP = cURP;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getNSS() {
		return NSS;
	}
	public void setNSS(String nSS) {
		NSS = nSS;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getDerechoHabiencia() {
		return derechoHabiencia;
	}
	public void setDerechoHabiencia(String derechoHabiencia) {
		this.derechoHabiencia = derechoHabiencia;
	}
	public char getSexoAlNacer() {
		return sexoAlNacer;
	}
	public void setSexoAlNacer(char sexoAlNacer) {
		this.sexoAlNacer = sexoAlNacer;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public List<GmjPacientesDomicilioPacienteDTO> getDomiciliosPaciente() {
		return domiciliosPaciente;
	}
	public void setDomiciliosPaciente(List<GmjPacientesDomicilioPacienteDTO> domiciliosPaciente) {
		this.domiciliosPaciente = domiciliosPaciente;
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
	
	
	
	
	
	
	
}
