/**
 * 
 */
package mx.com.mundodafne.ms.reportes.gmj.dto;

/**
 * 
 */
public class RepEntradaReportesDTO implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8681379504142099532L;
	private String codigo;
	private String[] parametros;
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
	 * @return the parametros
	 */
	public String[] getParametros() {
		return parametros;
	}
	/**
	 * @param parametros the parametros to set
	 */
	public void setParametros(String[] parametros) {
		this.parametros = parametros;
	}
}
