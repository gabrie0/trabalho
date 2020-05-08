package oxley.gabriel.manhaFinal.controller;

import oxley.gabriel.manhaFinal.model.BibliotecaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import oxley.gabriel.manhaFinal.repository.BibliotecaRepository;

import java.util.List;

    @RestController
    @RequestMapping("/biblioteca")
    public class BibliotecaControle {  //classe controladora

        @Autowired
        private BibliotecaRepository bibliotecaRepository;

        @GetMapping
        public ResponseEntity<List<BibliotecaEntity>> findAll() {  // get
            return new ResponseEntity<List<BibliotecaEntity>>(
                    (List<BibliotecaEntity>) this.bibliotecaRepository.findAll(),
                    new HttpHeaders(), HttpStatus.OK);//error 404
        }

        @GetMapping(path = "/{id}")
        // só um objeto
        public ResponseEntity<BibliotecaEntity> findById(@PathVariable("id") long id) {
            if (this.bibliotecaRepository.findById(id).isPresent()) {
                return new ResponseEntity<BibliotecaEntity>(
                        this.bibliotecaRepository.findById(id).get(),
                        new HttpHeaders(),
                        HttpStatus.OK);

            }
            return new ResponseEntity<BibliotecaEntity>(HttpStatus.NOT_FOUND);
        }

        public ResponseEntity<BibliotecaEntity> cadastrar(@RequestBody BibliotecaEntity bibliotecaEntity) {
            return new ResponseEntity<BibliotecaEntity>(
                    this.bibliotecaRepository.save(bibliotecaEntity),
                    new HttpHeaders(),
                    HttpStatus.CREATED
            );

        }

        // criando o método para atualizar...vai analisar se existe e depois salvar
        @PutMapping(value = "/{id}")
        public ResponseEntity<BibliotecaEntity>atualizar
        (@PathVariable("id") long id,
         @RequestBody BibliotecaEntity bibliotecaEntity) throws Exception {

            if (id == 0 || !this.bibliotecaRepository.existsById(id)) {
                throw new Exception("Código não encontrado ou inexistente!");

            }
            return new ResponseEntity<BibliotecaEntity>(
                    this.bibliotecaRepository.save(bibliotecaEntity),
                    new HttpHeaders(),
                    HttpStatus.OK);

        }

        // criando o método para deletar...

        @DeleteMapping(value = "/{id}")
        public ResponseEntity<BibliotecaEntity> deletar(@PathVariable("id") long id) {
            this.bibliotecaRepository.deleteById(id);
            return new ResponseEntity<BibliotecaEntity>(new HttpHeaders(), HttpStatus.OK);
        }
    }




