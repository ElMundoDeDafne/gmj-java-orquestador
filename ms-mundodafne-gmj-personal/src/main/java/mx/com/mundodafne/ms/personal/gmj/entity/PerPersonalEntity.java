package mx.com.mundodafne.ms.personal.gmj.entity;

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
@Table(name = "PER_PERSONAL")
public class PerPersonalEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersonal;
	private String cedulaProfesional;
	private LocalDateTime fechaAlta;
	private LocalDateTime fechaBaja;
	@Column(name = "CEDULA_PROF_ESP")
	private String cedulaProfesionalEspecialidad;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "ID_PERFIL_PROF", referencedColumnName = "ID_TIPO_PERSONAL")
	private CatPerfilProfesionalEntity catPerfilProfesionalEntity;
	
	
	/**
	 * 
	 * Inicio relaciones uno-uno
	 * */
    @OneToOne
    @MapsId // <-- CLAVE: indica que esta entidad comparte la PK con persona
    @JoinColumn(name = "id_personal") // columna FK que también es PK
	private PerPersonaEntity persona;
    
	public String getCedulaProfesional() {
		return cedulaProfesional;
	}
	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}
	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public LocalDateTime getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(LocalDateTime fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	public String getCedulaProfesionalEspecialidad() {
		return cedulaProfesionalEspecialidad;
	}
	public void setCedulaProfesionalEspecialidad(String cedulaProfesionalEspecialidad) {
		this.cedulaProfesionalEspecialidad = cedulaProfesionalEspecialidad;
	}
	public CatPerfilProfesionalEntity getCatPerfilProfesionalEntity() {
		return catPerfilProfesionalEntity;
	}
	public void setCatPerfilProfesionalEntity(CatPerfilProfesionalEntity catPerfilProfesionalEntity) {
		this.catPerfilProfesionalEntity = catPerfilProfesionalEntity;
	}
	public Long getIdPersonal() {
		return idPersonal;
	}
	public void setIdPersonal(Long idPersonal) {
		this.idPersonal = idPersonal;
	}
	public PerPersonaEntity getPersona() {
		return persona;
	}
	public void setPersona(PerPersonaEntity persona) {
		this.persona = persona;
	}
}
