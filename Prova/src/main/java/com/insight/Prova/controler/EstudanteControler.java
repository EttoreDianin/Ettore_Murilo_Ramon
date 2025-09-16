package com.insight.Prova.controler;

import com.insight.Prova.Service.EstudanteService;
import com.insight.Prova.entity.Estudante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteControler {
    @Autowired
    private EstudanteService estudanteService;

    @GetMapping
    public List<Estudante> findAll(){
        return estudanteService.findAll();
    }

    @PostMapping
    public Estudante criar(@RequestBody Estudante estudante){
        return estudanteService.criarEstudante(estudante);
    }

    @DeleteMapping
    public void deletar(@PathVariable Long id){
        estudanteService.deletar(id);
    }

    @GetMapping
    public Optional<Estudante> findByID(@PathVariable Long id){
        return estudanteService.findByID(id);
    }
}
