package mx.com.mundodafne.gmj.hoja.frontal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.mundodafne.gmj.hoja.frontal.entity.PerDomicilio;

@Repository
public interface GmjDomicilioPacienteRepository extends JpaRepository<PerDomicilio, Long>{

}
