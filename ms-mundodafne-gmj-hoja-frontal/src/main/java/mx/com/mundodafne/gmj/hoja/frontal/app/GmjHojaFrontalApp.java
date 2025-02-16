package mx.com.mundodafne.gmj.hoja.frontal.app;

import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjFrontalRespSalidaDTO;
import mx.com.mundodafne.gmj.hoja.frontal.dto.GmjHojaFrontalDTO;

public interface GmjHojaFrontalApp {
	GmjFrontalRespSalidaDTO registrarInfoBD(GmjHojaFrontalDTO hojaFrontalDTO);
}
