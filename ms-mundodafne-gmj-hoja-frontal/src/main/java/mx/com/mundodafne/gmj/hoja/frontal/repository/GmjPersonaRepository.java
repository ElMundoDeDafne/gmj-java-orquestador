/**
 * 
 */
package mx.com.mundodafne.gmj.hoja.frontal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.mundodafne.gmj.hoja.frontal.entity.PerPersona;

/**
 * 
 */
@Repository
public interface GmjPersonaRepository extends JpaRepository<PerPersona, Long> {
	
	@Query("SELECT per FROM PerPersona per WHERE per.nombrePropio1 = :nombrePropioUno and per.nombrePropio2 = :nombrePropioDos and per.apellidoPaterno =:apellidoPat and per.apellidoMaterno =:apellidoMat")
	List<PerPersona> buscarExistenciaPaciente(@Param("nombrePropioUno") String nombreUno, @Param("nombrePropioDos")String nombreDos, @Param("apellidoPat") String apellidoPat, @Param("apellidoMat") String apellidoMat);
}
