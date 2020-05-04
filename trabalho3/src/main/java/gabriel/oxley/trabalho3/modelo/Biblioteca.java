package gabriel.oxley.trabalho3.modelo;
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
public class Biblioteca {

    @Getter @Setter
    private String genero;

    @Getter @Setter
    private int estoque;

    @Getter @Setter
    private double senha;

}
