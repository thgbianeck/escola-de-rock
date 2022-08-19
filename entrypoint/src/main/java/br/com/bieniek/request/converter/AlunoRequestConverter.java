package br.com.bieniek.request.converter;

import br.com.bieniek.aluno.entity.Aluno;
import br.com.bieniek.request.AlunoRequest;
import org.springframework.stereotype.Component;

@Component
public class AlunoRequestConverter {

    public Aluno toAluno(AlunoRequest request) {
        return Aluno.from(request.getName());
    }
}
