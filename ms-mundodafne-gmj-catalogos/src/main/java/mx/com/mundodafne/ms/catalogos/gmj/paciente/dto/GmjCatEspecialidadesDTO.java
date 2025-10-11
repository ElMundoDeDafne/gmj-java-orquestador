package mx.com.mundodafne.ms.catalogos.gmj.paciente.dto;

import java.io.Serializable;

public class GmjCatEspecialidadesDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1431844588609308945L;
	private String codigoEspecialidad;
	private String descripcionEspe;
	/**
	 * @return the codigoEspecialidad
	 */
	public String getCodigoEspecialidad() {
		return codigoEspecialidad;
	}
	/**
	 * @param codigoEspecialidad the codigoEspecialidad to set
	 */
	public void setCodigoEspecialidad(String codigoEspecialidad) {
		this.codigoEspecialidad = codigoEspecialidad;
	}
	/**
	 * @return the descripcionEspe
	 */
	public String getDescripcionEspe() {
		return descripcionEspe;
	}
	/**
	 * @param descripcionEspe the descripcionEspe to set
	 */
	public void setDescripcionEspe(String descripcionEspe) {
		this.descripcionEspe = descripcionEspe;
	}
	
}
