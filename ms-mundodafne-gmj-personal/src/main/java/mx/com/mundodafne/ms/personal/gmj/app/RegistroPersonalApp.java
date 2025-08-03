package mx.com.mundodafne.ms.personal.gmj.app;

import mx.com.mundodafne.ms.personal.gmj.controller.RegistroPersonalDTO;

/**
 * Registro de personal a base de datos
 * @author Christian
 */
public interface RegistroPersonalApp {
	Boolean registrarPersonal(RegistroPersonalDTO registroDTO);
}
