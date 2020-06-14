package leao.mainar.exemploIngecaodependenciaV6;

import leao.mainar.exemploIngecaodependenciaV6.interfaces.AnimalInterface;
import leao.mainar.exemploIngecaodependenciaV6.model.Cat;
import leao.mainar.exemploIngecaodependenciaV6.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Mainar Leão
 * @since 13/06/2020
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private AnimalInterface animalInterface;

    public  void execute() {
        animalInterface.comunicar();
    }

}
