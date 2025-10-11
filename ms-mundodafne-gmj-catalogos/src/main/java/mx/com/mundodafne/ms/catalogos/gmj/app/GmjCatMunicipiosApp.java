package mx.com.mundodafne.ms.catalogos.gmj.app;

import java.util.List;

import mx.com.mundodafne.ms.catalogos.gmj.entity.CatMunicipio;

public interface GmjCatMunicipiosApp {
	/**Obtener todos los municipios*/
	List<CatMunicipio> findAllMunicipios();
}
