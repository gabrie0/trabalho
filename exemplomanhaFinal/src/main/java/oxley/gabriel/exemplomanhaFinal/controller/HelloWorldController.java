package oxley.gabriel.exemplomanhaFinal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/")
    public String index(){
        return "Seja Bem vindo ao Sistema API Teste";
    }

}
