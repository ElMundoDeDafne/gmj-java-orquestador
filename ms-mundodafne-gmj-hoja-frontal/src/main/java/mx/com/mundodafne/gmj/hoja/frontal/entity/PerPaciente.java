package mx.com.mundodafne.gmj.hoja.frontal.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PER_PACIENTE")
public class PerPaciente {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaciente;
	@Column(name = "MOTIVO_CONSULTA")
	private String motivoConsulta;
	@Column(name = "FECHA_INGRESO")
	private LocalDateTime fechaIngreso;
	@Column(name = "FECHA_ALTA")
	private LocalDateTime fechaAlta;
	private Double peso;
	private Double imc;
	private String pathSistema;
	private String folio;
	private LocalDateTime proximaCita;
	private LocalDateTime ultimaVisita;
	//Falta agregar especialidad, antecedentes familaires, grupo sanguineo
	
	/**
	 * 
	 * Inicio relaciones uno-uno
	 * */
    @OneToOne
    @MapsId // <-- CLAVE: indica que esta entidad comparte la PK con persona
    @JoinColumn(name = "id_paciente") // columna FK que también es PK
	private PerPersona persona;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_SIGNOS_VITALES", referencedColumnName = "ID_SIGNOS_VITALES")
	private PerSignosVitales signosVitales;
	
	/**
	 * 
	 * Fin relaciones uno-uno
	 * */	
	

	/**
	 * @return the idPaciente
	 */
	public Long getIdPaciente() {
		return idPaciente;
	}

	/**
	 * @param idPaciente the idPaciente to set
	 */
	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
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
	 * @return the fechaIngreso
	 */
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the fechaAlta
	 */
	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
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
	 * @return the imc
	 */
	public Double getImc() {
		return imc;
	}

	/**
	 * @param imc the imc to set
	 */
	public void setImc(Double imc) {
		this.imc = imc;
	}

	/**
	 * @return the pathSistema
	 */
	public String getPathSistema() {
		return pathSistema;
	}

	/**
	 * @param pathSistema the pathSistema to set
	 */
	public void setPathSistema(String pathSistema) {
		this.pathSistema = pathSistema;
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

	/**
	 * @return the proximaCita
	 */
	public LocalDateTime getProximaCita() {
		return proximaCita;
	}

	/**
	 * @param proximaCita the proximaCita to set
	 */
	public void setProximaCita(LocalDateTime proximaCita) {
		this.proximaCita = proximaCita;
	}

	/**
	 * @return the signosVitales
	 */
	public PerSignosVitales getSignosVitales() {
		return signosVitales;
	}

	/**
	 * @param signosVitales the signosVitales to set
	 */
	public void setSignosVitales(PerSignosVitales signosVitales) {
		this.signosVitales = signosVitales;
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

	public LocalDateTime getUltimaVisita() {
		return ultimaVisita;
	}

	public void setUltimaVisita(LocalDateTime ultimaVisita) {
		this.ultimaVisita = ultimaVisita;
	}
	
	
}