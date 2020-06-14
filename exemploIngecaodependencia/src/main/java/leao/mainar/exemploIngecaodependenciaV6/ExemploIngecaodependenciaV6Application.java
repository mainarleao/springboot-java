package leao.mainar.exemploIngecaodependenciaV6;

import leao.mainar.exemploIngecaodependenciaV6.model.Cat;
import leao.mainar.exemploIngecaodependenciaV6.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Mainar Leão
 * @since 13/06/2020
 */
@SpringBootApplication
public class ExemploIngecaodependenciaV6Application {

	public static void main(String[] args) {
//		correto
		ApplicationContext applicationContext = SpringApplication.run(ExemploIngecaodependenciaV6Application.class, args);
		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();
	}

}
