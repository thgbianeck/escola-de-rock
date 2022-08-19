package br.com.bieniek.aluno.usecase;

import br.com.bieniek.aluno.contract.AlunoRepository;
import br.com.bieniek.aluno.contract.RegistroAlunoBorda;
import br.com.bieniek.aluno.entity.Aluno;

import java.util.UUID;

public class RegistroAluno implements RegistroAlunoBorda {

    AlunoRepository alunoRepository;

    public RegistroAluno(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public void save(Aluno aluno) {
        aluno.setRegistrationNumber(UUID.randomUUID());
        alunoRepository.save(aluno);
    }
}
