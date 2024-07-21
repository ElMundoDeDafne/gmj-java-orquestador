/**
 * 
 */
package mx.com.mundodafne.gmj.orq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * 
 */
@Configuration
public class GmjWebClienteConfig {
	@Bean
	public WebClient.Builder webClientBuilder() {
		return WebClient.builder();
	};
}
