package gabriel.oxley.trabalho2.modelo;

import lombok.*;

import java.sql.Time;

/**
 *
 * @author Gabriel Oxley
 * @Since 2/05/2020 15h
 * @version trabalho 1
 */




@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String fuçao;

    @Getter @Setter
    private double salario;

}
