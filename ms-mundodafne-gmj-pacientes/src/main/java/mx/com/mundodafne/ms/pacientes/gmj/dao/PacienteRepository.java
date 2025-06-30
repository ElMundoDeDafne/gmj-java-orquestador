package mx.com.mundodafne.ms.pacientes.gmj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesOutDTO;
import mx.com.mundodafne.ms.pacientes.gmj.entity.PerPacienteEntity;

//public interface PacienteRepository extends CrudRepository<PerPacienteEntity, Long>{
public interface PacienteRepository extends JpaRepository<PerPacienteEntity, Long>{
	@Query(value="SELECT * FROM PER_PACIENTE WHERE FOLIO LIKE %:filtro%",nativeQuery = true)
	List<PerPacienteEntity> buscarPacientesPorFolio (@Param("filtro") String filtro);
}
