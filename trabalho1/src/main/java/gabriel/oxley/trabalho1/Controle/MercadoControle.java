package gabriel.oxley.trabalho1.Controle;

import gabriel.oxley.trabalho1.Modelo.Mercado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MercadoControle {
    @GetMapping("/")
    public String getmapping(){
        return "ola";
    }
    @GetMapping("/Mercado")
    public Mercado getMercado(){
        Mercado mercado = new Mercado();
        mercado.setNome("joão pessoa");
        mercado.setEstoque(20);
        mercado.setValor(2.5);
        return mercado;

    }
   @GetMapping("/listaMercado")
    public ArrayList<Mercado> getlistaMercado(){
        Mercado mercado1 = new Mercado();
        mercado1.setNome("joão pessoa");
        mercado1.setEstoque(20);
        mercado1.setValor(2.5);

       Mercado mercado2 = new Mercado();
       mercado2.setNome("mercado do Zé");
       mercado2.setEstoque(20);
       mercado2.setValor(2.5);

        ArrayList<Mercado> lista = new ArrayList<>();
        lista.add(mercado1);
        lista.add(mercado2);

       return lista;


   }
}