package gabriel.oxley.trabalho2.comtrole;

import gabriel.oxley.trabalho2.modelo.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
    public class FuncionarioControle{
    @GetMapping("/")
    public String getmapping() {
        return "bem vindo";
    }
@GetMapping("/Fucionario")
    public Funcionario getFuncionario() {
    Funcionario funcionario = new Funcionario();
    funcionario.setNome("joão");
    funcionario.setFuçao("recepcionista");
    funcionario.setSalario(40.50);
    return funcionario;
}
@GetMapping("/listaFuncionario")
    public ArrayList<Funcionario> getlistaFuncionario(){
    Funcionario funcionario1 = new Funcionario();
    funcionario1.setNome("joão");
    funcionario1.setFuçao("recepcionista");
    funcionario1.setSalario(40.5);


    Funcionario funcionario2 = new Funcionario();
    funcionario2.setNome("pedro");
    funcionario2.setFuçao("banqueiro");
    funcionario2.setSalario(60.5);

    Funcionario funcionario3 = new Funcionario();
    funcionario3.setNome("joão");
    funcionario3.setFuçao("faxineira");
    funcionario3.setSalario(20.5);

    ArrayList<Funcionario> list = new ArrayList<>();
    list.add(funcionario1);
    list.add(funcionario2);
    list.add(funcionario3);

    return list;


}
}