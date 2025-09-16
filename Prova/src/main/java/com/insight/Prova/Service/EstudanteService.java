package com.insight.Prova.Service;

import com.insight.Prova.entity.Estudante;
import com.insight.Prova.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {
    @Autowired
    private EstudanteRepository estudanteRepository;

    public List<Estudante> findAll(){
        return estudanteRepository.findAll();
    }

    public Estudante criarEstudante(Estudante estudante){
        return estudanteRepository.save(estudante);
    }

    public void deletar(Long id){
        estudanteRepository.deleteById(id);
    }

    public Optional<Estudante> findByID(Long id){
        return estudanteRepository.findById(id);
    }
}
