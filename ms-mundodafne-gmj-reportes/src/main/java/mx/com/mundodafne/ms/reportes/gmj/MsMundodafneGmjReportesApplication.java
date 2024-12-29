package mx.com.mundodafne.ms.reportes.gmj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MsMundodafneGmjReportesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMundodafneGmjReportesApplication.class, args);
	}

}
