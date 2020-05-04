package gabriel.oxley.trabalho1.Modelo;
import lombok.*;
/**
 *
 * @author Gabriel Oxley
 * @Since 1/05/2020 19h
 * @version trabalho 1
 */




@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Mercado {

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private int estoque;

    @Getter @Setter
    private double valor;

}
