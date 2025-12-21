package mx.com.mundodafne.ms.catalogos.gmj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.mundodafne.ms.catalogos.gmj.entity.CatPerfilProfesionalEntity;

@Repository
public interface CatPerfilProfesionalRepository extends JpaRepository<CatPerfilProfesionalEntity, Long>{
	@Query("SELECT pp FROM CatPerfilProfesionalEntity pp WHERE pp.codigo = :codigo")
	CatPerfilProfesionalEntity obtenerPerfilPorCodigo(@Param("codigo") String codigo);
}
