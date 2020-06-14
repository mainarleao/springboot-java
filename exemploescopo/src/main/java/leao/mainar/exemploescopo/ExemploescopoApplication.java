package leao.mainar.exemploescopo;

import leao.mainar.exemploescopo.dao.ClassDAO;
import leao.mainar.exemploescopo.dao.ClassJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Mainar Leão
 */
@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

		ClassJDBC objJDBC = applicationContext.getBean(ClassJDBC.class);
		ClassJDBC objJDBC1 = applicationContext.getBean(ClassJDBC.class);

		ClassDAO objDAO = applicationContext.getBean(ClassDAO.class);
		ClassDAO objDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto da class JDBC: " + objJDBC);
		System.out.println("Objeto da class JDBC1: " + objJDBC1);

		System.out.println("Objeto da class DAO: " + objDAO);
		System.out.println("Objeto da class DAO1: " + objDAO1);
	}

}
