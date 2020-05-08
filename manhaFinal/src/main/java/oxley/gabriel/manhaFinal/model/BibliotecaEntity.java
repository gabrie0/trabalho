package oxley.gabriel.manhaFinal.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

// JPA - Java Persistence API
@Entity
@Table(name= "biblioteca")
public class BibliotecaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_biblioteca")
    private long id;

    @Column(name = "genero")
    private String genero;

    @Column(name = "estoque")
    private double estoque;

    @Column(name = "numero_cartao")
    private int numero_cartao ;


}//fim

// Mapeamento de JPA
// Como se fosse o DAO no PHP..
// aqui ele indica onde cada dado irá entrar...
