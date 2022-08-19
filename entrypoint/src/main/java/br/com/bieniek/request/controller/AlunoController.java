package br.com.bieniek.request.controller;

import br.com.bieniek.aluno.contract.RegistroAlunoBorda;
import br.com.bieniek.request.AlunoRequest;
import br.com.bieniek.request.converter.AlunoRequestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final RegistroAlunoBorda registroAluno;

    @Autowired
    private AlunoRequestConverter requestConverter;

    public AlunoController(RegistroAlunoBorda registroAluno) {
        this.registroAluno = registroAluno;
    }

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
