package leao.mainar.exemplolombok.controllers;

import leao.mainar.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mainar Leão
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return  "Exemplo lombok";
    }

//    @GetMapping("/product")
//    public String getProduct() {
//        return "Objeto Produto";
//    }
}
