package mx.com.mundodafne.ms.catalogos.gmj.dto;

import java.io.Serializable;

public class RespuestaGenericaMSDTO<T> implements Serializable {
	private T datos;

	/**
	 * @return the datos
	 */
	public T getDatos() {
		return datos;
	}

	/**
	 * @param datos the datos to set
	 */
	public void setDatos(T datos) {
		this.datos = datos;
	}
	
	
}
