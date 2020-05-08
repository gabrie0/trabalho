package oxley.gabriel.manhaFinal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import oxley.gabriel.manhaFinal.model.BibliotecaEntity;


@Repository
public interface BibliotecaRepository extends CrudRepository<BibliotecaEntity, Long> {


}
