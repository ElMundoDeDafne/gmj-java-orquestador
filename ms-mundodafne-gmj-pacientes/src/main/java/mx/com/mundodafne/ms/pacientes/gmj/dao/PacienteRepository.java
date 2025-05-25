package mx.com.mundodafne.ms.pacientes.gmj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesOutDTO;
import mx.com.mundodafne.ms.pacientes.gmj.entity.PerPacienteEntity;

public interface PacienteRepository extends CrudRepository<PerPacienteEntity, Long>{
	
	@Query(value="SELECT ",nativeQuery = true)
	List<GmjBusquedaPacientesOutDTO> buscarPacientesPorFiltro (@Param("filtro") Object filtro);
}
