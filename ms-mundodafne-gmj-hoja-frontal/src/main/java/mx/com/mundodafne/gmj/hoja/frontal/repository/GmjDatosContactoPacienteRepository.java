package mx.com.mundodafne.gmj.hoja.frontal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.mundodafne.gmj.hoja.frontal.entity.PerDatosContacto;

@Repository
public interface GmjDatosContactoPacienteRepository extends JpaRepository<PerDatosContacto, Long> {

}
