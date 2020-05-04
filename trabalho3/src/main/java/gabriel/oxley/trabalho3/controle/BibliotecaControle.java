package gabriel.oxley.trabalho3.controle;

import gabriel.oxley.trabalho3.modelo.Biblioteca;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
@RestController
public class BibliotecaControle {

        @GetMapping("/")
        public String getmapping(){
            return "bem vindo usuario";
        }
        @GetMapping("/Biblioteca")
        public Biblioteca getBiblioteca(){
            Biblioteca biblioteca = new Biblioteca();
            biblioteca.setGenero("ação");
            biblioteca.setEstoque(20);
            biblioteca.setSenha(123);
            return biblioteca;
        }
    @GetMapping("/listaBiblioteca")
    public ArrayList<Biblioteca> getlistaBiblioteca(){
        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.setGenero("ação");
        biblioteca1.setEstoque(5);
        biblioteca1.setSenha(532);

        Biblioteca biblioteca2 = new Biblioteca();
        biblioteca2.setGenero("suspense");
        biblioteca2.setEstoque(10);
        biblioteca2.setSenha(987);

        Biblioteca biblioteca3 = new Biblioteca();
        biblioteca3.setGenero("teror");
        biblioteca3.setEstoque(10);
        biblioteca3.setSenha(987);

        ArrayList<Biblioteca> lista = new ArrayList<>();
        lista.add(biblioteca1);
        lista.add(biblioteca2);
        lista.add(biblioteca3);

        return lista;


    }

}
