package br.com.bieniek.request.controller;

import br.com.bieniek.aluno.entity.Aluno;
import br.com.bieniek.aluno.usecase.RegistroAluno;
import br.com.bieniek.request.AlunoRequest;
import br.com.bieniek.request.converter.AlunoRequestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private RegistroAluno registroAluno;

    @Autowired
    private AlunoRequestConverter requestConverter;

    @GetMapping
    public String doYouHearMe() {
        return "I Hear you";
    }

    @PostMapping
    public void save(@RequestBody AlunoRequest request) {
        var aluno = requestConverter.toAluno(request);
        this.registroAluno.save(aluno);
    }

}
