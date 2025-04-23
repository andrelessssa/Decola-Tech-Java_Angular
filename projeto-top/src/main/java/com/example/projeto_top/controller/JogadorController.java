package com.example.projeto_top.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto_top.model.JogadorModel;
import com.example.projeto_top.service.JogadorService;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    JogadorService jogadorService;

    @PostMapping
    public ResponseEntity<JogadorModel> save(@RequestBody JogadorModel jogadorModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorService.save(jogadorModel));
    }
    @GetMapping
    public ResponseEntity<List<JogadorModel>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(jogadorService.findAll());
    } 
    @GetMapping("/{nome}")
    public ResponseEntity<JogadorModel> findByNome(@PathVariable String nome){
        return ResponseEntity.status(HttpStatus.OK).body(jogadorService.findByNome(nome));

    }
    @GetMapping("/clubes/{clube}")
    public ResponseEntity<List<JogadorModel>> findByClube(@PathVariable String clube){
        return ResponseEntity.status(HttpStatus.OK).body(jogadorService.finByClube(clube));
    }

    
}
