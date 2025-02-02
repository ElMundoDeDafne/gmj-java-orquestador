package mx.com.mundodafne.gmj.hoja.frontal.dto;
//TODO: Agregar campos para objeto dto
public class GmjDatosContactoPacienteDTO implements java.io.Serializable {
	private String numeroTelefonico;
	private String correoElectronico;
	/**
	 * @return the numeroTelefonico
	 */
	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}
	/**
	 * @param numeroTelefonico the numeroTelefonico to set
	 */
	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	
}
