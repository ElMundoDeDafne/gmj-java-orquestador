package mx.com.mundodafne.ms.catalogos.gmj.app;

import java.util.List;

import mx.com.mundodafne.ms.catalogos.gmj.entity.CatEspecialidades;

public interface GmjCatEspecialiadesApp {
	/**
	 * Obtenemos lista de especialidades.
	 * @return {@code List<CatEspecialidades>} lista con especialidades
	 */
	List<CatEspecialidades> obtenerEspecialidades();
	String obtenerEspecialidadPorCodigo(String codigo);
	/***
	 * Registrar especialidad
	 * @return
	 */
	Boolean registrarEspecialidad();
	Boolean modificarEspecialidad();
	Boolean eliminarEspecialidad();
}
