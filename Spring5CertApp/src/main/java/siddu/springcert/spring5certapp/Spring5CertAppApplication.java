package siddu.springcert.spring5certapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import siddu.springcert.spring5certapp.controller.GreetingsController;

@SpringBootApplication
public class Spring5CertAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5CertAppApplication.class, args);
		GreetingsController gc = ctx.getBean(GreetingsController.class);
		System.out.println(gc.greet("Siddartha"));	
		
		
	}

}
