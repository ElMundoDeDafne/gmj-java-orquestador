/**
 * 
 */
package mx.com.mundodafne.ms.catalogos.gmj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.mundodafne.ms.catalogos.gmj.entity.CatEspecialidades;

/**
 * 
 */
@Repository
public interface CatEspecialidadesRepository extends JpaRepository<CatEspecialidades, Long> {
	@Query("SELECT catEsp FROM CatEspecialidades catEsp")
	List<CatEspecialidades> obtenerEspecialidades();
	
	@Query("select catEsp.nombre from CatEspecialidades catEsp where catEsp.codigo = :codigo")
	String findEspecialidadByCodigo(@Param("codigo") String codigo);
}
