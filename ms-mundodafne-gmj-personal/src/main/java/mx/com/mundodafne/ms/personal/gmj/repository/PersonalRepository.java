package mx.com.mundodafne.ms.personal.gmj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.mundodafne.ms.personal.gmj.entity.PerPersonalEntity;

@Repository
public interface PersonalRepository extends JpaRepository<PerPersonalEntity, Long> {
/*Agregar mas metodos por si se necesitan hacer queries personalizadas*/
}
