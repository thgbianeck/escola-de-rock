package br.com.bieniek.repository;

import br.com.bieniek.aluno.contract.AlunoRepository;
import br.com.bieniek.aluno.entity.Aluno;
import br.com.bieniek.repository.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {

    @Autowired
    AlunoDao alunoDao;
    @Override
    public void save(Aluno aluno) {
        alunoDao.save(AlunoEntity.from(aluno));
    }
}
