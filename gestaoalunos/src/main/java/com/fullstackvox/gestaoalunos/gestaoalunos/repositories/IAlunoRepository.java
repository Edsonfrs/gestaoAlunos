package com.fullstackvox.gestaoalunos.gestaoalunos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fullstackvox.gestaoalunos.gestaoalunos.models.Aluno;

public interface IAlunoRepository extends JpaRepository<Aluno, Integer> {
    
    
}
