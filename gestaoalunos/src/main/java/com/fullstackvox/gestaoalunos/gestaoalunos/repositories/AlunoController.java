package com.fullstackvox.gestaoalunos.gestaoalunos.repositories;

import com.fullstackvox.gestaoalunos.gestaoalunos.models.Aluno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alunos")
@CrossOrigin(origins = "*")
public class AlunoController {
    @Autowired
    private IAlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> retornarTodos() {
        List<Aluno> alunos = alunoRepository.findAll();
        return alunos;
    }
    
}
