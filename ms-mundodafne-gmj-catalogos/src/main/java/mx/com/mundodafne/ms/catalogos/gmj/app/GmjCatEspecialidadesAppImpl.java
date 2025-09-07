/**
 * 
 */
package mx.com.mundodafne.ms.catalogos.gmj.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.mundodafne.ms.catalogos.gmj.entity.CatEspecialidades;
import mx.com.mundodafne.ms.catalogos.gmj.repository.CatEspecialidadesRepository;

/**
 * 
 */
@Service
public class GmjCatEspecialidadesAppImpl implements GmjCatEspecialiadesApp {
	
	@Autowired CatEspecialidadesRepository catEspRepository;

	@Override
	/**
	 * {@inheritDoc}
	 */
	public List<CatEspecialidades> obtenerEspecialidades() {
		return catEspRepository.obtenerEspecialidades();
	}

	@Override
	public String obtenerEspecialidadPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return catEspRepository.findEspecialidadByCodigo(codigo);
	}

	@Override
	public Boolean registrarEspecialidad() {
		CatEspecialidades catEspecialidades = new CatEspecialidades();
		//de acuerdo al DTO de entrada entonces dar de alta nueva especialidad
		//catEspRepository
		catEspecialidades.setNombre("Odontopediatria");
		
		catEspRepository.save(catEspecialidades);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modificarEspecialidad() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarEspecialidad() {
		// TODO Auto-generated method stub
		return null;
	}

}
