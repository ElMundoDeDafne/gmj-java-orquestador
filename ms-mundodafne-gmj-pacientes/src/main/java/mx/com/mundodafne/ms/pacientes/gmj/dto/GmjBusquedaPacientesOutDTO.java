package mx.com.mundodafne.ms.pacientes.gmj.dto;

import java.io.Serializable;
import java.util.List;

/**
 * DTO de respuesta de busqueda de pacientes
 * */
public class GmjBusquedaPacientesOutDTO implements Serializable {
	
	List<GmjBusquedaPacientesOutDTO> coincidencias;
}
