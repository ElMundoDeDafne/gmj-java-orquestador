package mx.com.mundodafne.ms.catalogos.gmj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.mundodafne.ms.catalogos.gmj.entity.CatEspecialidades;
import mx.com.mundodafne.ms.catalogos.gmj.entity.CatMunicipio;
@Repository
public interface CatMunicipiosRepository extends JpaRepository<CatMunicipio, Long> {
	@Query("SELECT mun FROM CatMunicipio mun")
	List<CatMunicipio> findAllMunicipios();
	
	@Query("FROM CatMunicipio catMun where catMun.entidadFederativa.codigoEntidad = :codigoEstado")
	List<CatMunicipio> findMunicipioByCode(@Param("codigoEstado") String codigoEstado);
	
}
