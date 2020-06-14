package leao.mainar.exemplopostconstructpredestroy.dao;

import leao.mainar.exemplopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Mainar Leão
 */
@Getter @Setter

@Component
public class ClienteDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Objeto foi criado");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto finalizado");
    }
}
