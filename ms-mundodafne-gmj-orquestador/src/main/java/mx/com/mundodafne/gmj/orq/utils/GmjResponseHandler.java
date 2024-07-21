package mx.com.mundodafne.gmj.orq.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GmjResponseHandler {
	public static ResponseEntity<Object> generateResponseOK(String message, Object responseObj){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mensaje", message);
		map.put("data", responseObj);
		return new ResponseEntity<Object>(map,HttpStatus.OK);
	}
}
