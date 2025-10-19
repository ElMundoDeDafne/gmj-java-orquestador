package mx.com.mundodafne.ms.catalogos.gmj.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.mundodafne.ms.catalogos.gmj.entity.CatMunicipio;
import mx.com.mundodafne.ms.catalogos.gmj.repository.CatEspecialidadesRepository;
import mx.com.mundodafne.ms.catalogos.gmj.repository.CatMunicipiosRepository;

@Service
public class GmjCatMunicipiosAppImpl implements GmjCatMunicipiosApp{

	@Autowired CatMunicipiosRepository munRepository;
	
	@Override
	public List<CatMunicipio> findAllMunicipios() {
		// TODO Auto-generated method stub
		return munRepository.findAllMunicipios();
	}

	@Override
	public List<CatMunicipio> findMunicipiosByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return munRepository.findMunicipioByCode(codigo);
	}
	
	

}
