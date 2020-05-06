package oxley.gabriel.exemplomanhaFinal.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

// JPA - Java Persistence API
@Entity
@Table(name= "mercado")
public class MercadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mercado")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "salario")
    private double salario;




}//fim

// Mapeamento de JPA
// Como se fosse o DAO no PHP..
// aqui ele indica onde cada dado irá entrar...
