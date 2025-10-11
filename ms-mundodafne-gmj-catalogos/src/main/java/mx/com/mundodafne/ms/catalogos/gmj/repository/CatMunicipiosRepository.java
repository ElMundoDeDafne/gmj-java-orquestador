package mx.com.mundodafne.ms.catalogos.gmj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.com.mundodafne.ms.catalogos.gmj.entity.CatEspecialidades;
import mx.com.mundodafne.ms.catalogos.gmj.entity.CatMunicipio;
@Repository
public interface CatMunicipiosRepository extends JpaRepository<CatMunicipio, Long> {
	@Query("SELECT mun FROM CatMunicipio mun")
	List<CatMunicipio> findAllMunicipios();
}
