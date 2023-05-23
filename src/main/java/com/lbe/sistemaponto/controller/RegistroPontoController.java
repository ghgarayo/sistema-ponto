package com.lbe.sistemaponto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.lbe.sistemaponto.domain.funcionario.FuncionarioRepository;
import com.lbe.sistemaponto.domain.ponto.DadosBatidaPonto;
import com.lbe.sistemaponto.domain.ponto.DadosDetalhamentoPonto;
import com.lbe.sistemaponto.domain.ponto.Ponto;
import com.lbe.sistemaponto.domain.ponto.PontoRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/registra-ponto")
public class RegistroPontoController {
    
    @Autowired
    private PontoRepository repository;

    @Autowired 
    private FuncionarioRepository  funcionarioRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<DadosDetalhamentoPonto> cadastrar(@RequestBody @Valid DadosBatidaPonto dados, UriComponentsBuilder uriBuilder){
        // var funcionario = funcionarioRepository.findById(dados.funcionario().id());
        var registroPonto = new Ponto(dados);
        var uri = uriBuilder.path("/ponto/{idPonto}").buildAndExpand(registroPonto.getIdPonto()).toUri();
        repository.save(registroPonto);
        return ResponseEntity.created(uri).body(new DadosDetalhamentoPonto(registroPonto));
    }


}
