package mx.com.mundodafne.gmj.hoja.frontal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAT_PARENTESCO")
public class CatParentesco {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PARENTESCO")
	private Long idParentesco;
	@Column(name = "CODIGO")
	private String codigo;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "PARENTESCO")
	private String parentesco;
	/**
	 * @return the idParentesco
	 */
	public Long getIdParentesco() {
		return idParentesco;
	}
	/**
	 * @param idParentesco the idParentesco to set
	 */
	public void setIdParentesco(Long idParentesco) {
		this.idParentesco = idParentesco;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the parentesco
	 */
	public String getParentesco() {
		return parentesco;
	}
	/**
	 * @param parentesco the parentesco to set
	 */
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	
	
}
