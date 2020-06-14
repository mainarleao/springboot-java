package leao.mainar.exemplodepenenciarestrepositories.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mainar Leão
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public  String index() {
        return "ola Mundo";
    }
}
