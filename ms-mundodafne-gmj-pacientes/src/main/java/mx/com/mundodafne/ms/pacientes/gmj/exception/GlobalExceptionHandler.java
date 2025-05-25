package mx.com.mundodafne.ms.pacientes.gmj.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<Map<String,Object>> businessException(BusinessException ex){
		Map<String,Object> hmResp = new HashMap();
		hmResp.put("error",ex.getMessage());
		return new ResponseEntity<>(hmResp,HttpStatus.BAD_REQUEST);
	}
}
