/**
 * 
 */
package mx.com.mundodafne.gmj.hoja.frontal.dto;

/**
 * 
 */
public class GmjHistoriaClinicaDTO implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GmjAntHdoFamDTO[] antecedentesHdoFamiliares;
	private GmjantGinecoDTO[] antecedentesGinecobstetricos;
	private GmjAntNoPatDTO[] antecNoPatologicos;
	private GmjAntPatologicoDTO[] antecPatologicos;
	private GmjInterrogPxDTO interrogPx;
	private GmjNotaPacienteDTO notaMedicaPaciente;
	private GmjNotaEnfermeriaDTO notaEnfermeriaPx;
	private GmjConsultaOdontoDTO consultaOdontologia;
	/**
	 * @return the antecedentesHdoFamiliares
	 */
	public GmjAntHdoFamDTO[] getAntecedentesHdoFamiliares() {
		return antecedentesHdoFamiliares;
	}
	/**
	 * @param antecedentesHdoFamiliares the antecedentesHdoFamiliares to set
	 */
	public void setAntecedentesHdoFamiliares(GmjAntHdoFamDTO[] antecedentesHdoFamiliares) {
		this.antecedentesHdoFamiliares = antecedentesHdoFamiliares;
	}
	/**
	 * @return the antecedentesGinecobstetricos
	 */
	public GmjantGinecoDTO[] getAntecedentesGinecobstetricos() {
		return antecedentesGinecobstetricos;
	}
	/**
	 * @param antecedentesGinecobstetricos the antecedentesGinecobstetricos to set
	 */
	public void setAntecedentesGinecobstetricos(GmjantGinecoDTO[] antecedentesGinecobstetricos) {
		this.antecedentesGinecobstetricos = antecedentesGinecobstetricos;
	}
	/**
	 * @return the antecNoPatologicos
	 */
	public GmjAntNoPatDTO[] getAntecNoPatologicos() {
		return antecNoPatologicos;
	}
	/**
	 * @param antecNoPatologicos the antecNoPatologicos to set
	 */
	public void setAntecNoPatologicos(GmjAntNoPatDTO[] antecNoPatologicos) {
		this.antecNoPatologicos = antecNoPatologicos;
	}
	/**
	 * @return the antecPatologicos
	 */
	public GmjAntPatologicoDTO[] getAntecPatologicos() {
		return antecPatologicos;
	}
	/**
	 * @param antecPatologicos the antecPatologicos to set
	 */
	public void setAntecPatologicos(GmjAntPatologicoDTO[] antecPatologicos) {
		this.antecPatologicos = antecPatologicos;
	}
	/**
	 * @return the interrogPx
	 */
	public GmjInterrogPxDTO getInterrogPx() {
		return interrogPx;
	}
	/**
	 * @param interrogPx the interrogPx to set
	 */
	public void setInterrogPx(GmjInterrogPxDTO interrogPx) {
		this.interrogPx = interrogPx;
	}
	/**
	 * @return the notaMedicaPaciente
	 */
	public GmjNotaPacienteDTO getNotaMedicaPaciente() {
		return notaMedicaPaciente;
	}
	/**
	 * @param notaMedicaPaciente the notaMedicaPaciente to set
	 */
	public void setNotaMedicaPaciente(GmjNotaPacienteDTO notaMedicaPaciente) {
		this.notaMedicaPaciente = notaMedicaPaciente;
	}
	/**
	 * @return the notaEnfermeriaPx
	 */
	public GmjNotaEnfermeriaDTO getNotaEnfermeriaPx() {
		return notaEnfermeriaPx;
	}
	/**
	 * @param notaEnfermeriaPx the notaEnfermeriaPx to set
	 */
	public void setNotaEnfermeriaPx(GmjNotaEnfermeriaDTO notaEnfermeriaPx) {
		this.notaEnfermeriaPx = notaEnfermeriaPx;
	}
	/**
	 * @return the consultaOdontologia
	 */
	public GmjConsultaOdontoDTO getConsultaOdontologia() {
		return consultaOdontologia;
	}
	/**
	 * @param consultaOdontologia the consultaOdontologia to set
	 */
	public void setConsultaOdontologia(GmjConsultaOdontoDTO consultaOdontologia) {
		this.consultaOdontologia = consultaOdontologia;
	}
}