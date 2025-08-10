package mx.com.mundodafne.ms.pacientes.gmj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import mx.com.mundodafne.ms.pacientes.gmj.dto.GmjBusquedaPacientesOutDTO;
import mx.com.mundodafne.ms.pacientes.gmj.entity.PerPacienteEntity;

public interface PacienteRepository extends JpaRepository<PerPacienteEntity, Long>{
//	@Query(value="SELECT * FROM PER_PACIENTE WHERE FOLIO LIKE %:filtro%",nativeQuery = true)
	@Query(value="SELECT pp FROM PerPacienteEntity pp WHERE pp.folio LIKE %:filtro%")
	List<PerPacienteEntity> buscarPacientesPorFolio (@Param("filtro") String filtro);
	
	
	//arreglar
	@Query(value="select ppac from PerPacienteEntity ppac where ppac.perPersona.nombrePropio1 like %:nombre%",nativeQuery = false)
	List<PerPacienteEntity> buscarPacientesPorNombre(@Param("nombre") String nombre);
	/**Ojo: Cambiarle por la tabla, vista u objeto correspondiente y tambien columna */
	@Query(value="SELECT * FROM PER_PACIENTE WHERE NOMBRE_PROPIO LIKE %:localidad%",nativeQuery = true)
	List<PerPacienteEntity> buscarPacientesPorLocalidad(@Param("localidad") String localidad);
	/**Ojo: Cambiarle por la tabla, vista u objeto correspondiente y tambien columna */
	@Query(value="SELECT * FROM PER_PACIENTE WHERE NOMBRE LIKE %:curp%",nativeQuery = true)
	List<PerPacienteEntity> buscarPacientesPorCURP(@Param("curp") String curp);
	/**Ojo: Cambiarle por la tabla, vista u objeto correspondiente y tambien columna */
	@Query(value="SELECT * FROM PER_PACIENTE WHERE NOMBRE LIKE %:especialidad%",nativeQuery = true)
	List<PerPacienteEntity> buscarPacientesPorEspecialidad(@Param("especialidad") String especialidad);

	/**Ojo: Cambiarle por la tabla, vista u objeto correspondiente y tambien columna */
	@Query(value="SELECT * FROM PER_PACIENTE WHERE NOMBRE LIKE %:medicoTratante%",nativeQuery = true)
	List<PerPacienteEntity> buscarPacientesPorMedicoTratante(@Param("medicoTratante") String medicoTratante);
//	
	//Aqui agregar query con texto para los pacientes de la semana
}
