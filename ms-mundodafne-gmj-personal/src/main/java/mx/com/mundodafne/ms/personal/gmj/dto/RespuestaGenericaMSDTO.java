package mx.com.mundodafne.ms.personal.gmj.dto;

public class RespuestaGenericaMSDTO<T> {
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
