package fr.valarep.projet_spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.valarep.projet_spring.components.InjectionParConstructeurComponent;
import fr.valarep.projet_spring.services.ServiceBonjourimpl;

@SpringBootTest
class ProjetSpringApplicationTests {

	@Test
	public void testInjectionParConstructeurComponent() {
		InjectionParConstructeurComponent comp = new InjectionParConstructeurComponent(new ServiceBonjourimpl());

		assertEquals("Salut tertous !", comp.direBonjour());
	}

}
