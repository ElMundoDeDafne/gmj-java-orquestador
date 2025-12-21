package mx.com.mundodafne.ms.catalogos.gmj.app;

import java.util.List;

import mx.com.mundodafne.ms.catalogos.gmj.entity.CatPerfilProfesionalEntity;

public interface GmjCatPerfProfApp {
	List<CatPerfilProfesionalEntity> obtenerPerfilesProfesionales();
	CatPerfilProfesionalEntity obtenerPerfilPorCodigo(String codigo);
}
