package mx.com.mundodafne.ms.personal.gmj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAT_PERFIL_PROFESIONAL")
public class CatPerfilProfesionalEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_TIPO_PERSONAL")
	Long idTipoPersonal;
	String codigo;
	String descripcion;
	public Long getIdTipoPersonal() {
		return idTipoPersonal;
	}
	public void setIdTipoPersonal(Long idTipoPersonal) {
		this.idTipoPersonal = idTipoPersonal;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
