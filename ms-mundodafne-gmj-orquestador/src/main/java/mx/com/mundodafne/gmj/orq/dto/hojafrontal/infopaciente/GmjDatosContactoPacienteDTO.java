package mx.com.mundodafne.gmj.orq.dto.hojafrontal.infopaciente;

public class GmjDatosContactoPacienteDTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -187392687399869277L;
	private String numeroTelefono;
	private String correoElectronico;
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
}
