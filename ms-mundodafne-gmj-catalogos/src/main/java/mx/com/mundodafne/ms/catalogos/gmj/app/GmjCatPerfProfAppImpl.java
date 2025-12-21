/**
 * 
 */
package mx.com.mundodafne.ms.catalogos.gmj.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mx.com.mundodafne.ms.catalogos.gmj.entity.CatPerfilProfesionalEntity;
import mx.com.mundodafne.ms.catalogos.gmj.repository.CatPerfilProfesionalRepository;

/**
 * 
 */
@Service
public class GmjCatPerfProfAppImpl implements GmjCatPerfProfApp {

	@PersistenceContext EntityManager em;
	@Autowired CatPerfilProfesionalRepository perfilProfesionalRepository;
	
	@Override
	public List<CatPerfilProfesionalEntity> obtenerPerfilesProfesionales() {
		return perfilProfesionalRepository.findAll();
	}

	@Override
	public CatPerfilProfesionalEntity obtenerPerfilPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return perfilProfesionalRepository.obtenerPerfilPorCodigo(codigo);
	}

}
