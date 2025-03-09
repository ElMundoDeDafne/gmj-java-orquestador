package mx.com.mundodafne.gmj.hoja.frontal.app;

import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjFrontalRespSalidaDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHojaFrontalDTO;
import mx.com.mundodafne.gmj.hoja.frontal.exception.BusinessException;

public interface GmjHojaFrontalApp {
	GmjFrontalRespSalidaDTO registrarInfoBD(GmjHojaFrontalDTO hojaFrontalDTO) throws BusinessException;
}
