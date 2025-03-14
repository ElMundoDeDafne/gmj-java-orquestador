package mx.com.mundodafne.gmj.hoja.frontal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.mundodafne.gmj.hoja.frontal.entity.PerPaciente;
import mx.com.mundodafne.gmj.hoja.frontal.entity.PerPersona;
@Repository
public interface GmjPacienteRepository extends JpaRepository<PerPaciente, Long> {

}
