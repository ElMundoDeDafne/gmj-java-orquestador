package mx.com.mundodafne.gmj.hoja.frontal.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PER_PERSONA")
public class PerPersona {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PERSONA")
	private Long idPersona;
	@Column(name = "NOMBRE_PROPIO_1")
	private String nombrePropio1;
	@Column(name = "NOMBRE_PROPIO_2")
	private String nombrePropio2;
	@Column(name = "AP_PATERNO")
	private String apellidoPaterno;
	@Column(name = "AP_MATERNO")
	private String apellidoMaterno;
	@Column(name = "EDAD")
	private Integer edad;
	@Column(name = "GENERO")
	private String genero;
	@Column(name = "FECHA_NACIMIENTO")
	private LocalDate fechaNacimiento;
	@Column(name = "CURP")
	private String curp;
	@Column(name = "OCUPACION")
	private String ocupacion;
	@Column(name = "FECHA_REGISTRO")
	private LocalDateTime fechaRegistro;
	@Column(name = "FECHA_BAJA")
	private LocalDateTime fechaBaja;
	private String derechoHabiente;
	private String nss;
	
	//1 persona tiene 1 domicilio
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_DOMICILIO", referencedColumnName = "ID_DOMICILIO")
	private PerDomicilio domicilio;
	
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
	private PerPaciente perPaciente;
	
	/**
	 * @return the idPersona
	 */
	public Long getIdPersona() {
		return idPersona;
	}
	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
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
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
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
	 * @return the ocupacion
	 */
	public String getOcupacion() {
		return ocupacion;
	}
	/**
	 * @param ocupacion the ocupacion to set
	 */
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	/**
	 * @return the fechaRegistro
	 */
	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}
	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	/**
	 * @return the fechaBaja
	 */
	public LocalDateTime getFechaBaja() {
		return fechaBaja;
	}
	/**
	 * @param fechaBaja the fechaBaja to set
	 */
	public void setFechaBaja(LocalDateTime fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	/**
	 * @return the domicilio
	 */
	public PerDomicilio getDomicilio() {
		return domicilio;
	}
	/**
	 * @param domicilio the domicilio to set
	 */
	public void setDomicilio(PerDomicilio domicilio) {
		this.domicilio = domicilio;
	}
	/**
	 * @return the derechoHabiente
	 */
	public String getDerechoHabiente() {
		return derechoHabiente;
	}
	/**
	 * @param derechoHabiente the derechoHabiente to set
	 */
	public void setDerechoHabiente(String derechoHabiente) {
		this.derechoHabiente = derechoHabiente;
	}
	/**
	 * @return the nss
	 */
	public String getNss() {
		return nss;
	}
	/**
	 * @param nss the nss to set
	 */
	public void setNss(String nss) {
		this.nss = nss;
	}
	/**
	 * @return the perPaciente
	 */
	public PerPaciente getPerPaciente() {
		return perPaciente;
	}
	/**
	 * @param perPaciente the perPaciente to set
	 */
	public void setPerPaciente(PerPaciente perPaciente) {
		this.perPaciente = perPaciente;
	}

	

}
