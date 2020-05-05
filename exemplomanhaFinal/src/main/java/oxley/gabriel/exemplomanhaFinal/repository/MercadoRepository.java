package oxley.gabriel.exemplomanhaFinal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import oxley.gabriel.exemplomanhaFinal.model.MercadoEntity;


@Repository
public interface MercadoRepository extends CrudRepository<MercadoEntity, Long> { // retorno long


}
