package mx.com.mundodafne.gmj.hoja.frontal.entity;

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
@Table(name = "PER_DATOS_CONTACTO")
public class PerDatosContacto {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DATOS_CONTACTO")
	private Long idDatosContacto;
	@Column(name = "IDENTIFICADOR")
	private String identificador;
	private String codigoIdentificador;
	private LocalDateTime fechaActualizacion;
	private LocalDateTime fechaRegistro;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA")
	private PerPersona persona;

	/**
	 * @return the idDatosContacto
	 */
	public Long getIdDatosContacto() {
		return idDatosContacto;
	}

	/**
	 * @param idDatosContacto the idDatosContacto to set
	 */
	public void setIdDatosContacto(Long idDatosContacto) {
		this.idDatosContacto = idDatosContacto;
	}

	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the codigoIdentificador
	 */
	public String getCodigoIdentificador() {
		return codigoIdentificador;
	}

	/**
	 * @param codigoIdentificador the codigoIdentificador to set
	 */
	public void setCodigoIdentificador(String codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	/**
	 * @return the fechaActualizacion
	 */
	public LocalDateTime getFechaActualizacion() {
		return fechaActualizacion;
	}

	/**
	 * @param fechaActualizacion the fechaActualizacion to set
	 */
	public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
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
	 * @return the persona
	 */
	public PerPersona getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(PerPersona persona) {
		this.persona = persona;
	}
	
	
}
