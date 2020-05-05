package oxley.gabriel.exemplomanhaFinal.controller;

import oxley.gabriel.exemplomanhaFinal.model.MercadoEntity;
import oxley.gabriel.exemplomanhaFinal.repository.MercadoRepository;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

    @RestController
    @RequestMapping("/funcionarios")
    public class  MercadoControle {  //classe controladora

        @Autowired
        private MercadoRepository mercadoRepository;

        @GetMapping
        public ResponseEntity<List<MercadoEntity>> findAll() {  // get
            return new ResponseEntity<List<MercadoEntity>>(
                    (List<MercadoEntity>) this.mercadoRepository.findAll(),
                    new HttpHeaders(), HttpStatus.OK);//error 404
        }

        @GetMapping(path = "/{id}")
        // só um objeto
        public ResponseEntity<MercadoEntity> findById(@PathVariable("id") long id) {
            if (this.mercadoRepository.findById(id).isPresent()) {
                return new ResponseEntity<MercadoEntity>(
                        this.mercadoRepository.findById(id).get(),
                        new HttpHeaders(),
                        HttpStatus.OK);

            }
            return new ResponseEntity<MercadoEntity>(HttpStatus.NOT_FOUND);
        }

        public ResponseEntity<MercadoEntity> cadastrar(@RequestBody MercadoEntity mercadoEntity) {
            return new ResponseEntity<MercadoEntity>(
                    this.mercadoRepository.save(mercadoEntity),
                    new HttpHeaders(),
                    HttpStatus.CREATED
            );

        }

        // criando o método para atualizar...vai analisar se existe e depois salvar
        @PutMapping(value = "/{id}")
        public ResponseEntity<MercadoEntity> atualizar(@PathVariable("id") long id,
                                                       @RequestBody MercadoEntity mercadoEntity) throws Exception {

            if (id == 0 || !this.mercadoRepository.existsById(id)) {
                throw new Exception("Código não encontrado ou inexistente!");

            }
            return new ResponseEntity<MercadoEntity>(
                    this.mercadoRepository.save(mercadoEntity),
                    new HttpHeaders(),
                    HttpStatus.OK);

        }

        // criando o método para deletar...

        @DeleteMapping(value = "/{id}")
        public ResponseEntity<MercadoEntity> deletar(@PathVariable("id") long id) {
            this.mercadoRepository.deleteById(id);
            return new ResponseEntity<MercadoEntity>(new HttpHeaders(), HttpStatus.OK);
        }
    }




