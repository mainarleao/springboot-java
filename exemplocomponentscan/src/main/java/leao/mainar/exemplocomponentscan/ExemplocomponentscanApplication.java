package leao.mainar.exemplocomponentscan;

import dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Mainar Leão
 */
@SpringBootApplication
@ComponentScan("dao")
public class ExemplocomponentscanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplocomponentscanApplication.class, args);

		ClassDAO ObjectDAO = applicationContext.getBean(ClassDAO.class);

		System.out.println("ObjectDAO: " + ObjectDAO);
		System.out.println("ObjectJDBC dentro do objectDAO" + ObjectDAO.getClassJDBC());
	}

}
