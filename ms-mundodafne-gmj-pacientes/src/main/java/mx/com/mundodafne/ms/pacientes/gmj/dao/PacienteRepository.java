package mx.com.mundodafne.ms.pacientes.gmj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesOutDTO;
import mx.com.mundodafne.ms.pacientes.gmj.entity.PerPacienteEntity;

public interface PacienteRepository extends JpaRepository<PerPacienteEntity, Long>{
	@Query(value="SELECT * FROM PER_PACIENTE WHERE FOLIO LIKE %:filtro%",nativeQuery = true)
	List<PerPacienteEntity> buscarPacientesPorFolio (@Param("filtro") String filtro);
	
	
	//arreglar
	@Query(value="select ppac.*,pp.* from per_persona pp, per_paciente ppac where pp.nombre_propio_1 like '%:nombre%' and pp.id_persona = ppac.id_persona",nativeQuery = true)
	List<PerPacienteEntity> buscarPacientesPorNombre(@Param("nombre") String filtro);
	/**Ojo: Cambiarle por la tabla, vista u objeto correspondiente y tambien columna */
	@Query(value="SELECT * FROM PER_PACIENTE WHERE NOMBRE_PROPIO LIKE %:localidad%",nativeQuery = true)
	List<PerPacienteEntity> buscarPacientesPorLocalidad(@Param("localidad") String filtro);
	/**Ojo: Cambiarle por la tabla, vista u objeto correspondiente y tambien columna */
	@Query(value="SELECT * FROM PER_PACIENTE WHERE NOMBRE LIKE %:curp%",nativeQuery = true)
	List<PerPacienteEntity> buscarPacientesPorCURP(@Param("curp") String filtro);
	/**Ojo: Cambiarle por la tabla, vista u objeto correspondiente y tambien columna */
	@Query(value="SELECT * FROM PER_PACIENTE WHERE NOMBRE LIKE %:especialidad%",nativeQuery = true)
	List<PerPacienteEntity> buscarPacientesPorEspecialidad(@Param("especialidad") String filtro);

	/**Ojo: Cambiarle por la tabla, vista u objeto correspondiente y tambien columna */
	@Query(value="SELECT * FROM PER_PACIENTE WHERE NOMBRE LIKE %:medicoTratante%",nativeQuery = true)
	List<PerPacienteEntity> buscarPacientesPorMedicoTratante(@Param("medicoTratante") String filtro);
//	
	//Aqui agregar query con texto para los pacientes de la semana
}
