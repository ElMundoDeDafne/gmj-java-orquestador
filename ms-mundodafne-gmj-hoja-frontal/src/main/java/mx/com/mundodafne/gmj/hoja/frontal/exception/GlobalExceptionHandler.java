package mx.com.mundodafne.gmj.hoja.frontal.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<Map<String,Object>> errorNegocio(BusinessException ex) {
		Map<String,Object> hmResp = new HashMap();
		hmResp.put("error", ex.getMessage());
		return new ResponseEntity<>(hmResp,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<Map<String,Object>> errorNotFound(NotFoundException ex) {
		Map<String,Object> hmResp = new HashMap();
		hmResp.put("error", ex.getMessage());
		return new ResponseEntity<>(hmResp,HttpStatus.NOT_FOUND);
	}
	
	//Error desconocido.
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Map<String,Object>> error(Exception ex) {
		Map<String,Object> hmResp = new HashMap();
		hmResp.put("error", ex.getMessage());
		return new ResponseEntity<>(hmResp,HttpStatus.INTERNAL_SERVER_ERROR);
	}	
	
}
