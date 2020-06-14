package leao.mainar.exemplopostconstructpredestroy;

import leao.mainar.exemplopostconstructpredestroy.dao.ClienteDAO;
import leao.mainar.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Mainar Leão
 */
@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClienteDAO clienteDAO = applicationContext.getBean(ClienteDAO.class);

		clienteDAO.setClient(new Client("Mainar", "Leão"));

		System.out.println("ClientDAO: " + clienteDAO);
		System.out.println("Client: " + clienteDAO.getClient().toString());
	}

}
