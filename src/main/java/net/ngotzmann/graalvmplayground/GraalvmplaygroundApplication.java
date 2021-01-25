package net.ngotzmann.graalvmplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class GraalvmplaygroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraalvmplaygroundApplication.class, args);
	}

}
