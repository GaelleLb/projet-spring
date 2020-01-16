package fr.valarep.projet_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fr.valarep.projet_spring.components.ExempleComponent;


@SpringBootApplication
public class ProjetSpringApplication {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ProjetSpringApplication.class, args);

		ExempleComponent comp = (ExempleComponent) ctx.getBean("exempleComponent");
		comp.bonjour();

	}

}
