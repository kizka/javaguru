package lv.javaguru.vika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"lv.javaguru.vika"})
public class JavaguruApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaguruApplication.class, args);
	}
}
