package mx.com.mundodafne.gmj.hoja.frontal.dto;

import java.io.Serializable;

public class GmjInterrogPxDTO implements Serializable {
	
	private GmjExpFisicas[] exploracionesFisicas;
	private GmjExpAparatoYSist[] aparatoYSistemas;
	/**
	 * @return the exploracionesFisicas
	 */
	public GmjExpFisicas[] getExploracionesFisicas() {
		return exploracionesFisicas;
	}
	/**
	 * @param exploracionesFisicas the exploracionesFisicas to set
	 */
	public void setExploracionesFisicas(GmjExpFisicas[] exploracionesFisicas) {
		this.exploracionesFisicas = exploracionesFisicas;
	}
	/**
	 * @return the aparatoYSistemas
	 */
	public GmjExpAparatoYSist[] getAparatoYSistemas() {
		return aparatoYSistemas;
	}
	/**
	 * @param aparatoYSistemas the aparatoYSistemas to set
	 */
	public void setAparatoYSistemas(GmjExpAparatoYSist[] aparatoYSistemas) {
		this.aparatoYSistemas = aparatoYSistemas;
	}
	
	}
