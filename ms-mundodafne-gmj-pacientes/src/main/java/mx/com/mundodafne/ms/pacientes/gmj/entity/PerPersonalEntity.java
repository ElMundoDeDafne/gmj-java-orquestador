package mx.com.mundodafne.ms.pacientes.gmj.entity;

import java.time.LocalDateTime;

//public class PerPersonalEntity extends PerPersonaEntity {
public class PerPersonalEntity {
	private Long idPersonal;
	private String cedulaProfesional;
	private CatPerfilProfesionalEntity catPerfilProfesional;
	private LocalDateTime fechaBaja;
	public Long getIdPersonal() {
		return idPersonal;
	}
	public void setIdPersonal(Long idPersonal) {
		this.idPersonal = idPersonal;
	}
	public String getCedulaProfesional() {
		return cedulaProfesional;
	}
	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}
	public CatPerfilProfesionalEntity getCatPerfilProfesional() {
		return catPerfilProfesional;
	}
	public void setCatPerfilProfesional(CatPerfilProfesionalEntity catPerfilProfesional) {
		this.catPerfilProfesional = catPerfilProfesional;
	}
	public LocalDateTime getFechaBaja() {
		return fechaBaja;
	}
	public void setFechaBaja(LocalDateTime fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
	
}
