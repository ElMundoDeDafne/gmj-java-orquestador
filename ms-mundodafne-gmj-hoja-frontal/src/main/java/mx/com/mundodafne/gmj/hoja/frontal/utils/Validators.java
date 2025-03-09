package mx.com.mundodafne.gmj.hoja.frontal.utils;

public class Validators {
	private Validators() {}
	
	public static Object checkNull(Object obj) {
		return obj!=null?obj:null;
	}
}
