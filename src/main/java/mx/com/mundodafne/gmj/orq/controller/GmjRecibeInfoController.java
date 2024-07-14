package mx.com.mundodafne.gmj.orq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.gmj.orq.dto.global.GmjObjetoPacienteDTO;
import mx.com.mundodafne.gmj.orq.dto.historialclinico.GmjHistorialClinicoDTO;

/**
 * Controlador que recibe toda la informacion a concentrar.
 * */
@RestController
public class GmjRecibeInfoController {
	/**
	 * { "hojaFrontal": { "informacionPx": {}, "domicilioPaciente": {
	 * "codigoPostal": "" }, "datosContacto": {} }, "historiaClinica": {
	 * "antecedentesHdoFamiliares": [ {} ], "antecedentesGinecobstetricos": {
	 * "fechaUltimaCitologia": "", "fechaUltimaRegla": "", "fechaUltimoParto": "",
	 * "hijosVivos": 0, "numAborts": 0, "numCesareas": 0, "numGestas": 0,
	 * "numPartos": 0, "inicioVidaSexual": "" }, "antecNoPatologicos": {
	 * "conceptoFauna": [ { "concepto": "Perros", "situacion": "" }, { "concepto":
	 * "Gatos", "situacion": "" }, { "concepto": "Otros", "situacion": "", "otros":
	 * "" } ], "conceptoVivienda": [ { "concepto": "Luz", "situacion": "" }, {
	 * "concepto": "Agua", "situacion": "" }, { "concepto": "Drenaje", "situacion":
	 * "" } ], "concepto": [ { "concepto": "Dieta", "situacion": "" }, { "concepto":
	 * "Vivienda", "situacion": "" }, { "concepto": "Promiscuidad", "situacion": ""
	 * }, { "concepto": "Hacinamiento", "situacion": "" } ], "inmunizaciones": [ {}
	 * ] }, "antecPatologicos": [ {} ], "interrogPx": { "exploracionesFisicas": [ {
	 * "zonaInspeccion": "Piel y Faneras", "observacionesInspeccion": "" }, {
	 * "zonaInspeccion": "Cabeza y Organos de los Sentidos",
	 * "observacionesInspeccion": "" }, { "zonaInspeccion": "Cuello",
	 * "observacionesInspeccion": "" }, { "zonaInspeccion": "Torax",
	 * "observacionesInspeccion": "" }, { "zonaInspeccion": "Abdomen",
	 * "observacionesInspeccion": "" }, { "zonaInspeccion": "Columna Vertebral",
	 * "observacionesInspeccion": "" }, { "zonaInspeccion": "Genitales",
	 * "observacionesInspeccion": "" }, { "zonaInspeccion": "Ano y Recto",
	 * "observacionesInspeccion": "" } ], "aparatoYSistemas": [ { "concepto":
	 * "Exploracion Vaginal", "semioloia": "" }, { "concepto": "Extremidades",
	 * "semioloia": "" }, { "concepto": "Organos de los sentidos", "semioloia": ""
	 * }, { "concepto": "Sistema nervioso central", "semioloia": "" }, { "concepto":
	 * "Sistema nervioso periferico", "semioloia": "" }, { "concepto": "Aparato
	 * Respiratorio", "semioloia": "" }, { "concepto": "Sistema Cardivascular",
	 * "semioloia": "" }, { "concepto": "Aparato Digestivo", "semioloia": "" }, {
	 * "concepto": "Aparato Renal y Urinario", "semioloia": "" }, { "concepto":
	 * "Aparato Genital", "semioloia": "" }, { "concepto": "Sistema Esqueletico y
	 * Muscular", "semioloia": "" } ] } }, "notaMedicaPaciente": { "cedulaProfNM":
	 * "", "exploracion": "", "hallazgos": "", "recomendaciones": "",
	 * "impresionDiagnostica": [], "realizoNM": "" }, "notaEnfermeriaPx": {
	 * "accionesDxEnf": "", "accionesNEnf": "", "cedulaProfNEnf": "", "realizoNEnf":
	 * "", "resultadosNEnf": "", "signosVitales": { "temperatura": 0,
	 * "frecuenciaCardiaca": 0, "presionDiast": 0, "presionSist": 0,
	 * "cuentaConAyuno": "false" } } }
	 * 
	 */
	@GetMapping("api/v1/gmj/orq/concentrar")
	public void ConcentraInfo(GmjObjetoPacienteDTO objetoPacienteDTO) {
		
	}
}
